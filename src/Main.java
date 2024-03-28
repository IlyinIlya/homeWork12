public class Main {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в нашу библиотеку!");
        //добавим новую книгу и выведем результат в консоль
        Author authorOne = new Author("Толстой", "Лев", "Николаевич");
        Book bookOne = new Book("Война и Мир", authorOne, 1865);
        System.out.println(bookOne + " | Хэшкод:" + bookOne.hashCode());

        //внесем правки в год публикации
        bookOne.setYearPublication(1866);
        System.out.println("Внесена правка для книги: " + bookOne.getBookName() + ". Год публикации: " + bookOne.getYearPublication());

        //добавим вторую книгу в нашу библиотеку
        Author authorTwo = new Author("Булгаков", "Михаил", "Афанасьевич");
        Book bookTwo = new Book("Собачье сердце", authorTwo, 1925);
        System.out.println(bookTwo + " | Хэшкод:" + bookTwo.hashCode());

        if (authorOne.equals(authorTwo)) {
            System.out.println("Авторы идентичны друг другу");
        } else {
            System.out.println("Авторы разные");
        }
        if (bookOne.equals(bookTwo)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }


    }
}
