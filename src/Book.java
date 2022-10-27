import java.util.Objects;

public class Book {
    private final String bookTitle;
    private int yearOfPublication;
    private final Author author;


    public Book(String bookTitle, Author author, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }


    public String getAuthor() {
        return this.author.getNameAuthor();
    }


    public String getBookTitle() {
        return this.bookTitle;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int year) {
        this.yearOfPublication = year;
    }



    @Override
    public String toString() {
        return "Название книги: " + this.bookTitle + ". Автор: " + this.author + "Дата публикации книги: " + this.yearOfPublication + "г.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, yearOfPublication, author);
    }
}
