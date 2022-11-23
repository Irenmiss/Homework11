package Homework11;

public class Book {
    private String nameOfBook;
    private int yearOfPublication;
    private Author authorName;

    public Book(String nameOfBook, Author authorName, int yearOfPublication) {
        this.nameOfBook = nameOfBook;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthorName() {
        return authorName.getFirstNameOfAuthor() + " " + authorName.getLastNameOfAuthor();
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
