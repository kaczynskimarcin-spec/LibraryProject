package library;

class Main {
    public static void main(String[] args) {

        Library library = new Library();


        // 2️⃣ Dodajemy książki
        library.addBook(new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", "A1", 1911));
        library.addBook(new Book("Pan Tadeusz", "Adam Mickiewicz", "B3", 1834));
        library.addBook(new Book("Harry Potter", "J.K. Rowling", "C5", 1997));
        library.addBook(new Book("Przygody Tomka Sawyera", "Mark Twain", "A2", 1876));

        // 3️⃣ Wyświetlamy wszystkie książki
        System.out.println("=== Wszystkie książki ===");
        library.displayBooks();

        // 4️⃣ Szukamy książki po tytule
        String titleToFind = "Harry Potter";
        Book found = library.findBookByTitle(titleToFind);

        if (found != null) {
            System.out.println("Znaleziono książkę: " + found.getTitle());
        } else {
            System.out.println("Nie znaleziono książki o tytule: " + titleToFind);
        }

        // 5️⃣ Wypożyczamy książkę
        if (found != null && found.borrowBook()) {
            System.out.println("Książka '" + found.getTitle() + "' została wypożyczona.");
        } else {
            System.out.println("Książka jest już niedostępna.");
        }

        // 6️⃣ Pokazujemy status dostępności
        System.out.println(found.getTitle() + " dostępność: " + (found.isAvailable() ? "tak" : "nie"));

        // 7️⃣ Zwracamy książkę
        found.returnBook();
        System.out.println(found.getTitle() + " dostępność po zwrocie: " + (found.isAvailable() ? "tak" : "nie"));

    }

}
