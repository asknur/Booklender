package Homework44;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookHandler {
    public static Map<String, Object> handleBooks() {
        List<Book> books = List.of(
                new Book("1", "Белый пароход", "Чингиз Торекулович Айтматов", true, "emp1"),
                new Book("2", "Java для начинающих", "Г. Шилдт", false, null),
                new Book("4", "Война и мир", "Лев Толстой", false, null),
                new Book("5", "Преступление и наказание", "Фёдор Достоевский", true, null),
                new Book("6", "1984", "Джордж Оруэлл", false, null),
                new Book("7", "Мастер и Маргарита", "Михаил Булгаков", true, null),
                new Book("8", "Улисс", "Джеймс Джойс", false, null),
                new Book("9", "Анна Каренина", "Лев Толстой", false, null),
                new Book("10", "Идиот", "Фёдор Достоевский", true, "emp2"),
                new Book("11", "Портрет Дориана Грея", "Оскар Уайльд", false, null),
                new Book("12", "Три товарища", "Эрих Мария Ремарк", true, null),
                new Book("13", "Герой нашего времени", "Михаил Лермонтов", false, null),
                new Book("14", "Над пропастью во ржи", "Джером Сэлинджер", false, null),
                new Book("15", "Приключение Тома Сойера", "Марк Твен", false, null)
        );

        Map<String, Object> model = new HashMap<>();
        model.put("books", books);
        return model;
    }

    public static Map<String, Object> handleOneBook(String id) {
        Book book = new Book(id, "Чистый код", "Роберт Мартин", true, "emp1");
        Map<String, Object> model = new HashMap<>();
        model.put("book", book);
        return model;
    }
}
