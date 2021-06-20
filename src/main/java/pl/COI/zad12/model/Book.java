package pl.COI.zad12.model;

public class Book {
    private Integer id;
    private String iban;
    private String author;
    private String title;

    public Book() {
    }

    public Book(Integer id, String iban, String author, String title) {
        this.id = id;
        this.iban = iban;
        this.author = author;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
