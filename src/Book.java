public class Book {
    private String bookName;
    private String author;
    private int yearPublication;

    public Book(String bookName, String author, int yearPublication) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublication = yearPublication;
        System.out.println("Название: " + bookName);
        System.out.println("Автор: " + author);
        System.out.println("Год публикации: " + yearPublication);
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
