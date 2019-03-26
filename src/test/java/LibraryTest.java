import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {
    Library library;
    Book book1, book2, book3;

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
    }

    @Test
    public void getBookCount() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBookToCollection() {
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void addBookToCollectionFullCapacity() {
        library.setCapacity(true);
        library.addBook(book1);
        assertEquals(0, library.bookCount());
    }

    @Test
    public void checkCapacity() {
        library.setCapacity(true);
        assertTrue(library.getCapacity());
    }

    @Test
    public void lendBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.lend(book1);
        assertEquals(1, library.bookCount());


    }



}
