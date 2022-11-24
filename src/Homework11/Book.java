package Homework11;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Название: " + nameOfBook + "\n" + authorName + "\n" + "Год издания: " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nameOfBook.equals(book.nameOfBook) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, authorName);
    }
}
