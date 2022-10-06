import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author);
    }

    @Override
    public String toString() {
        return "Book :" + " bookTitle = '" + bookTitle + "'" +
                ", author = " + author.toString() +
                ", publishYear = " + publishYear;
    }
}
