package Homework44;

import java.util.List;

public class Employee {
    private String id;
    private String name;
    private List<String> currentBooks;
    private List<String> historyBooks;

    public Employee(String id, String name, List<String> currentBooks, List<String> historyBooks) {
        this.id = id;
        this.name = name;
        this.currentBooks = currentBooks;
        this.historyBooks = historyBooks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCurrentBooks() {
        return currentBooks;
    }

    public void setCurrentBooks(List<String> currentBooks) {
        this.currentBooks = currentBooks;
    }

    public List<String> getHistoryBooks() {
        return historyBooks;
    }

    public void setHistoryBooks(List<String> historyBooks) {
        this.historyBooks = historyBooks;
    }
}
