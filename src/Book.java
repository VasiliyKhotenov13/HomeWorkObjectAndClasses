public class Book {
    String bookTitle;
    private int yearOfPublication;
    Author author;


    public Book(String bookTitle, Author author, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }


    public String getAuthor() {
        return this.author.nameAuthor;
    }


    public String getBookTitle() {
        return this.bookTitle;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearPubl) {
        this.yearOfPublication = yearPubl;
    }


}
