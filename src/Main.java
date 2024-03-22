public class Main {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в нашу библиотеку!");
        Book book = new Book("Война и Мир",
                Author.newBookAuthor("Толстой", "Лев", "Николаевич"),
                1865);
        book.setYearPublication(1866);
        System.out.println("Внесена правка, год публикации: " + book.getYearPublication());

        book = new Book("Собачье сердце",
                Author.newBookAuthor("Булгаков", "Михаил", "Афанасьевич"),
                1925);

    }
}