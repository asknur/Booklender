package Homework44;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeHandler {
    private static final List<Book> ALL_BOOKS = List.of(
            new Book("1", "Белый пароход", "Чингиз Торекулович Айтматов", true, "emp1"),
            new Book("2", "Java для начинающих", "Г. Шилдт", true, "emp1"),
            new Book("3", "Приключение Тома Сойера", "Марк Твен", false, null));

    public static Map<String, Object> handleEmployee(String id) {
        Employee emp = new Employee("emp1", "Steve Jobs", List.of("1", "2"), List.of("3"));

        List<Book> currentBooks = ALL_BOOKS.stream()
                .filter(b -> emp.getCurrentBooks().contains(b.getId()))
                .collect(Collectors.toList());

        List<Book> historyBooks = ALL_BOOKS.stream()
                .filter(b -> emp.getHistoryBooks().contains(b.getId()))
                .collect(Collectors.toList());

        Map<String, Object> model = new HashMap<>();
        model.put("employee", emp);
        model.put("currentBooks", currentBooks);
        model.put("historyBooks", historyBooks);
        return model;
    }
}



