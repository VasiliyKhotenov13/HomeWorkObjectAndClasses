public class Author {
    String name;
    String lastName;
    String nameAuthor;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.nameAuthor = name + ' ' + lastName;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}