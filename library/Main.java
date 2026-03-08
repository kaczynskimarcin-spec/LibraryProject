package library;

class Main {
    public static void main(String[] args) {

    Library library = new Library();
    Book b1 = new Book("Przygody Tomka Sawyera", "Mark Twain", "A2",1876);
    library.addBook(b1);
    library.displayBooks();

    }
}
