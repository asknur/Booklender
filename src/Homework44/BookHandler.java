package Homework44;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookHandler {
    public static Map<String, Object> handleBooks() {
        List<Book> books = List.of(
                new Book("1", "Белый пароход", "Чингиз Айтматов", true, "emp1",
                        "Повесть о мальчике и его деде-оленеводе, живущих на берегу озера Иссык-Куль.",
                        "https://ru-images.kinorium.com/movie/1080/141525.jpg?1627126817"),

                new Book("2", "Java для начинающих", "Герберт Шилдт", false, null,
                        "Полное руководство по Java для начинающих программистов.",
                        "https://ir.ozone.ru/multimedia/c1000/1025459620.jpg"),

                new Book("3", "Приключения Тома Сойера", "Марк Твен", false, null,
                        "Захватывающие приключения мальчика Тома и его друга Гекльберри Финна.",
                        "https://static.insales-cdn.com/r/R3gTgC4RTNg/rs:fit:1000:0:1/q:100/plain/images/products/1/7448/311672088/%D0%91%D0%B5%D0%B7%D1%8B%D0%BC%D1%8F%D0%BD%D0%BD%D1%8B%D0%B92.png@png"),

                new Book("4", "Война и мир", "Лев Толстой", false, null,
                        "Эпический роман о русском обществе во время войны с Наполеоном.",
                        "https://m.media-amazon.com/images/I/912F83swwRL._UF1000,1000_QL80_.jpg"),

                new Book("5", "Преступление и наказание", "Фёдор Достоевский", true, "emp2",
                        "Психологический роман о студенте Раскольникове, совершившем убийство.",
                        "https://s5-goods.ozstatic.by/1000/719/294/101/101294719_0.jpg"),

                new Book("6", "1984", "Джордж Оруэлл", false, null,
                        "Антиутопия о тоталитарном обществе под постоянным наблюдением.",
                        "https://cdn.respublica.ru/uploads/01/00/00/1l/jn/large_webp_2236d1e62beb731e.webp?1387650624"),

                new Book("7", "Мастер и Маргарита", "Михаил Булгаков", true, "emp3",
                        "Мистический роман о визите дьявола в Москву 1930-х годов.",
                        "https://www.moscowbooks.ru/image/book/708/orig/i708783.jpg?cu=20201216154536"),

                new Book("8", "Улисс", "Джеймс Джойс", false, null,
                        "Модернистский роман, описывающий один день из жизни дублинца.",
                        "https://www.litres.ru/pub/c/cover/69138172.jpg"),

                new Book("9", "Анна Каренина", "Лев Толстой", false, null,
                        "История трагической любви замужней женщины к офицеру Вронскому.",
                        "https://cdn.azbooka.ru/cv/w1100/f85b70c8-f0e4-4104-bd2e-b3de263793d8.jpg"),

                new Book("10", "Идиот", "Фёдор Достоевский", true, "emp4",
                        "Роман о князе Мышкине, пытающемся привнести добро в жестокий мир.",
                        "https://cdn.azbooka.ru/cv/w1100/ac3a9217-8087-425e-ae59-cb062edb21a2.jpg"),

                new Book("11", "Портрет Дориана Грея", "Оскар Уайльд", false, null,
                        "История о человеке, чей портрет стареет вместо него.",
                        "https://content1.rozetka.com.ua/goods/images/big/428987371.jpg"),

                new Book("12", "Три товарища", "Эрих Мария Ремарк", true, "emp5",
                        "Роман о дружбе и любви в послевоенной Германии.",
                        "https://cdn.скидкагид.рф/images/prodacts/sourse/61697/61697333_tri-tovarischa-ast.jpg"),

                new Book("13", "Герой нашего времени", "Михаил Лермонтов", false, null,
                        "Психологический портрет современника Лермонтова Печорина.",
                        "https://cdn.azbooka.ru/cv/w1100/5061fd29-00b3-4776-b247-35382c535628.jpg"),

                new Book("14", "Над пропастью во ржи", "Джером Сэлинджер", false, null,
                        "История подростка Холдена Колфилда, не принимающего фальшь взрослых.",
                        "https://nukadeti.ru/content/images/essence/tale/9047/9889.jpg"),

                new Book("15", "Сто лет одиночества", "Габриэль Гарсиа Маркес", false, null,
                        "Сага о семье Буэндиа в вымышленном городе Макондо.",
                        "https://vknige.net/wp-content/uploads/2021/02/4292.jpg")
        );

        Map<String, Object> model = new HashMap<>();
        model.put("books", books);
        return model;
    }

    public static Map<String, Object> handleOneBook(String id) {
        // Здесь можно реализовать поиск книги по ID из общего списка
        // Для примера создаем новую книгу
        Book book = new Book("16", "Чистый код", "Роберт Мартин", true, "emp1",
                "Руководство по написанию читаемого и поддерживаемого кода.",
                "https://imo10.labirint.ru/books/642466/cover.jpg/242-0"
        );

        Map<String, Object> model = new HashMap<>();
        model.put("book", book);
        return model;
    }

}
