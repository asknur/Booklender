package kg.attractor.java.Homework44;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean taken;
    private String isTakenBy;

    public Book(String id, String title, String author, boolean taken, String isTakenBy) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.taken = taken;
        this.isTakenBy = isTakenBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    public String getIsTakenBy() {
        return isTakenBy;
    }

    public void setIsTakenBy(String isTakenBy) {
        this.isTakenBy = isTakenBy;
    }
}
