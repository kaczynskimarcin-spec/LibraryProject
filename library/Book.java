package library;

public class Book {

    private String title;
    private String author;
    private int publishYear;
    private String location;
    private boolean available;

    public Book(String title, String author, String location, int publishYear) {
        this.title = title;
        this.author = author;
        this.location = location;
        this.publishYear = publishYear;
        available =  true;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public int getPublishYear() {
        return publishYear;
    }
    public String getLocation() {
        return location;
    }
    public boolean isAvailable() {
        return available;
    }

    public boolean borrowBook() {
        if (!available) {
            return false;
        }else {
            available = false;
            return true;
        }

    }
    public void returnBook() {
        if (!available) {
            available = true;
        }
    }


    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publish Year: " + publishYear);
        System.out.println("Location: " + location);
        System.out.println("Available: " + (available? "Yes" : "No"));
    }


}
