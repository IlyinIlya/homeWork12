import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int yearPublication;

    public Book(String bookName, Author author, int yearPublication) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String toString() {
        return "Название: " + this.bookName +
                ", Автор: " + this.author +
                ", Год издания: " + this.yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearPublication);
    }
}
