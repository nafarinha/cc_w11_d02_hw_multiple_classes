import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Book book1, book2, book3;
    Borrower borrower;


    @Before
    public void before() {
        library = new Library();

        book1 = new Book();
        book1.addAuthor("J. R. R. Tolkien");
        book1.addTitle("The Lord of The Rings");
        book1.addGenre("Fantasy");

        book2 = new Book();
        book2.addAuthor("Frank Herbert");
        book2.addTitle("Dune");
        book2.addGenre("Science Fiction");

        book3 = new Book();
        book3.addAuthor("George Orwell");
        book3.addTitle("Nineteen Eighty-Four");
        book3.addGenre("Dystopian");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        borrower = new Borrower();
    }

    @Test
    public void getBookCount() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void addBorrowedBook() {
        borrower.addBorrowedBook(book1);
        assertEquals(1, borrower.bookCount());
    }

//    @Test
//    public void borrowBook() {
//        borrower.borrow(book1);
//
//        assertEquals(2, library.bookCount());
//        assertEquals(1, borrower.bookCount());
//    }
}
