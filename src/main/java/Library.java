import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private boolean fullCapacity;

    public Library() {
       this.bookCollection = new ArrayList<>();
       this.fullCapacity = false;

    }

    public int bookCount() {
        return bookCollection.size();
    }

    public void addBook(Book newBook) {
        if (!this.fullCapacity) this.bookCollection.add(newBook);
    }

    public void setCapacity(boolean newStatus) {
        this.fullCapacity = newStatus;
    }

    public boolean getCapacity() {
        return this.fullCapacity;
    }


}
