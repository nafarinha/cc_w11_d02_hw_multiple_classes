import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<>();
    }

    public int bookCount() {
        return this.borrowedBooks.size();
    }

    public void addBorrowedBook(Book newBook) {
        this.borrowedBooks.add(newBook);
    }

    public void borrow(Library library, Book newBorrowedBook) {
        Book borrowedBook = library.lend(newBorrowedBook);
        this.addBorrowedBook(borrowedBook);
    }
}
