import java.util.Objects;

public class Author {
    private final String name;
    private final String lastName;
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

    @Override
    public String toString() {
        return " Имя - " + this.name + ". Фамилия - " + this.lastName + ". ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}