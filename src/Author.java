public class Author {
    private String firstName;
    private String lastName;
    private String middleName;

    public Author(String lastName, String firstName, String middleName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public static String newBookAuthor(String lastName, String firstName, String middleName) {
        Author author = new Author(firstName, middleName, lastName);
        author.firstName = firstName;
        author.middleName = middleName;
        author.lastName = lastName;
        String newAuthor = author.getLastName() + " " + author.getFirstName() + " " + author.getMiddleName();
        return newAuthor;
    }
}