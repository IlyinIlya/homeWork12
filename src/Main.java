public class Main {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в нашу библиотеку!");
        //добавим новую книгу и выведем результат в консоль
        Author author = new Author("Толстой", "Лев", "Николаевич");
        Book book = new Book("Война и Мир", author, 1865);
        System.out.println("Автор: " + book.getAuthor().getLastName() + " " +
                book.getAuthor().getFirstName() + " " + book.getAuthor().getMiddleName());
        System.out.println("Название: " + book.getBookName());
        System.out.println("Год издания: " + book.getYearPublication());

        //внесем правки в год публикации
        book.setYearPublication(1866);
        System.out.println("Внесена правка, год публикации: " + book.getYearPublication());

        //добавим вторую книгу в нашу библиотеку
        author = new Author("Булгаков", "Михаил", "Афанасьевич");
        book = new Book("Собачье сердце", author, 1925);
        System.out.println("Автор: " + book.getAuthor().getLastName() + " " +
                book.getAuthor().getFirstName() + " " + book.getAuthor().getMiddleName());
        System.out.println("Название: " + book.getBookName());
        System.out.println("Год издания: " + book.getYearPublication());
    }
}