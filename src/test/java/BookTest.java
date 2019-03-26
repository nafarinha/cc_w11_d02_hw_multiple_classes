import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

   Book book1;
   Book book2;
   Book book3;

   @Before
    public void before() {
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
    public void hasAuthor() {
      book1.addAuthor("Tolkien");
       assertEquals("Tolkien", book1.getAuthor());
   }

   @Test
   public void hasTitle() {
      book1.addTitle("The Two Towers");
      assertEquals("The Two Towers", book1.getTitle());
   }


}
