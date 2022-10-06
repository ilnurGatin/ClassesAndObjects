public class Book {
    private final String bookTitle;
    private final Author author;
    private int publishYear;

    public Book(String bookTitle, Author author , int publishYear) {

        this.bookTitle = bookTitle;
        this.author = author;
        this.publishYear = publishYear;

    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public  Author getAuthor() {
        return this.author;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}
