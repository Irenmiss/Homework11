package Homework11;

import java.util.Objects;

public class Author {
    private String firstNameOfAuthor;
    private String lastNameOfAuthor;

    public Author(String firstNameOfAuthor, String lastNameOfAuthor) {
        this.firstNameOfAuthor = firstNameOfAuthor;
        this.lastNameOfAuthor = lastNameOfAuthor;
    }

    public String getFirstNameOfAuthor() {
        return firstNameOfAuthor;
    }

    public String getLastNameOfAuthor() {
        return lastNameOfAuthor;
    }

    @Override
    public String toString() {
        return "Автор: " + firstNameOfAuthor + " " + lastNameOfAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstNameOfAuthor.equals(author.firstNameOfAuthor) && lastNameOfAuthor.equals(author.lastNameOfAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameOfAuthor, lastNameOfAuthor);
    }

}
