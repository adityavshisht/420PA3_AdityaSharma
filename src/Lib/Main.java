package Lib;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("Moby Dick", "Herman Melville");

        System.out.println("Add Book 1: " + library.addBook(book1));
        System.out.println("Add Book 2: " + library.addBook(book2));
        System.out.println("Add Book 1 again: " + library.addBook(book1));

        Book searchedBook = library.searchBook("Moby Dick");
        if (searchedBook != null) {
            System.out.println("Found Book: " + searchedBook.getTitle());
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("Remove Book 'The Great Gatsby': " + library.removeBook("The Great Gatsby"));
        System.out.println("Remove Book 'Nonexistent Book': " + library.removeBook("Nonexistent Book"));
    }
}
