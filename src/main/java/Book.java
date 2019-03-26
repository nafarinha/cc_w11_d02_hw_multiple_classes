public class Book {

    private String title;
    private String author;
    private String genre;

    public Book() {
    }

    public void addTitle(String newTitle) {
        this.title = newTitle;
    }

    public void addAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void addGenre(String newGenre) {
        this.genre = newGenre;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }
}
