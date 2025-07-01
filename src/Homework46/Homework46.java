package Homework46;

import Homework44.BookHandler;
import Homework45.Homework45;
import Homework45.User;
import com.sun.net.httpserver.HttpExchange;
import kg.attractor.java.server.Cookie;
import kg.attractor.java.utils.Utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Homework46 extends Homework45 {

    public Homework46(String host, int port) throws IOException {
        super(host, port);
        registerGet("/cookie", this::cookieHandler);
        registerGet("/books", this::booksHandler);
        registerPost("/take", this::takeHandler);
        registerPost("/return", this::returnHandler);
        registerGet("/logout", this::logoutHandler);
    }

    private void cookieHandler(HttpExchange exchange) {
        Map<String, Object> data = new HashMap<>();
        String name = "times";

        String cookieStr = getCookies(exchange);
        Map<String, String> cookies = Cookie.parse(cookieStr);
        String cookieValue = cookies.getOrDefault(name, "0");
        int times = Integer.parseInt(cookieValue) + 1;

        Cookie response = new Cookie<>(name, times);
        setCookie(exchange, response);

        data.put(name, times);
        data.put("cookies", cookies);
        renderTemplate(exchange, "cookie.ftlh", data);
    }

    private User getCurrentUser(HttpExchange exchange) {
        String cookieStr = getCookies(exchange);
        Map<String, String> cookies = Cookie.parse(cookieStr);
        String sessionId = cookies.get("sessionId");
        return sessions.get(sessionId);
    }

    private void booksHandler(HttpExchange exchange) {
        User user = getCurrentUser(exchange);
        if (user == null) {
            redirect303(exchange, "/login");
            return;
        }

        Map<String, Object> model = BookHandler.handleBooks();
        renderTemplate(exchange, "books.ftlh", model);
    }

    private void takeHandler(HttpExchange exchange) {
        User user = getCurrentUser(exchange);
        if (user == null) {
            redirect303(exchange, "/login");
            return;
        }

        Map<String, String> params = Utils.parseUrlEncoded(getBody(exchange), "&");
        String bookId = params.get("id");

        redirect303(exchange, "/books");
    }

    private void returnHandler(HttpExchange exchange) {
        User user = getCurrentUser(exchange);
        if (user == null) {
            redirect303(exchange, "/login");
            return;
        }

        Map<String, String> params = Utils.parseUrlEncoded(getBody(exchange), "&");
        String bookId = params.get("id");

        redirect303(exchange, "/books");
    }

    private void logoutHandler(HttpExchange exchange) {
        Cookie expired = new Cookie<>("sessionId", "");
        expired.setMaxAge(0);
        expired.setHttpOnly(true);
        setCookie(exchange, expired);
        redirect303(exchange, "/login");
    }
}
