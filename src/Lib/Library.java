package Lib;
import java.util.HashSet;
public class Library {
    private HashSet<Book> books;

    public Library() {
        books = new HashSet<>();
    }

    public boolean addBook(Book book) {
        return books.add(book);
    }

    public boolean removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}

