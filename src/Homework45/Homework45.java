package Homework45;

import com.sun.net.httpserver.HttpExchange;
import kg.attractor.java.lesson44.Lesson44Server;
import kg.attractor.java.server.ContentType;
import kg.attractor.java.server.Cookie;
import kg.attractor.java.utils.Utils;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class Homework45 extends Lesson44Server {
    private User currentUser = null;
    protected final Map<String, User> sessions = new HashMap<>();


    public Homework45(String host, int port) throws IOException {
        super(host, port);
        registerGet("/register", this::registerGet);
        registerPost("/register", this::registerPost);

        registerGet("/login", this::loginGet);
        registerPost("/login", this::loginPost);

        registerGet("/profile", this::profileGet);
    }


    private void registerGet(HttpExchange exchange) {
        Path path = makeFilePath("register.ftlh");
        sendFile(exchange, path, ContentType.TEXT_HTML);
    }

    private void registerPost(HttpExchange exchange) {
        String cType = getContentType(exchange);
        String raw = getBody(exchange);

        Map<String, String> parsed = Utils.parseUrlEncoded(raw, "&");
        String email = parsed.getOrDefault("email", "");
        String fullName = parsed.getOrDefault("fullName", "");
        String password = parsed.getOrDefault("password", "");

        List<User> users = UserStorage.readUsers();
        users.add(new User(email, fullName, password));
        UserStorage.writeUsers(users);

        redirect303(exchange, "/register");
    }

    //    ------------------Task2-------------------

    private void loginGet(HttpExchange exchange) {
        Path path = makeFilePath("login.ftlh");
        sendFile(exchange, path, ContentType.TEXT_HTML);
    }

    private void loginPost(HttpExchange exchange) {
        Map<String, String> parsed = Utils.parseUrlEncoded(getBody(exchange), "&");

        String email = parsed.getOrDefault("email", "");
        String password = parsed.getOrDefault("password", "");

        List<User> users = UserStorage.readUsers();
        Optional<User> matched = users.stream().filter(u -> u.getEmail().equals(email) && u.getPassword().equals(password))
                .findFirst();
        if (matched.isPresent()) {
            currentUser = matched.get();
            String sessionId = UUID.randomUUID().toString();
            sessions.put(sessionId, currentUser);
            Cookie sessionCookie = new Cookie<>("sessionId", sessionId);
            sessionCookie.setMaxAge(600);
            sessionCookie.setHttpOnly(true);
            setCookie(exchange, sessionCookie);
            redirect303(exchange, "/profile");
        } else {
            redirect303(exchange, "/login");
        }
    }

    private void profileGet(HttpExchange exchange) {
        Map<String, Object> model = new HashMap<>();
        String cookieStr = getCookies(exchange);
        Map<String, String> cookies = Cookie.parse(cookieStr);
        String sessionId = cookies.get("sessionId");
        User sessionUser = sessions.get(sessionId);
        if (currentUser != null) {
            model.put("email", currentUser.getEmail());
            model.put("name", currentUser.getFullName());
        } else {
            model.put("email", "анонимный@mail.com");
            model.put("name", "Некий пользователь");
        }
        renderTemplate(exchange, "profile.ftlh", model);


    }
}

