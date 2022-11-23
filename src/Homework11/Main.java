package Homework11;

public class Main {
    public static void main(String[] args) {
        Author author_1 = new Author("Клайв С.", "Льюис");
        Book book_1 = new Book("Лев, колдунья и платяной шкаф", author_1, 1950);
        Author author_2 = new Author("Айра", "Левин");
        Book book_2 = new Book("День совершенства", author_2, 2000);
        book_1.setYearOfPublication(2007);
        System.out.println(book_1.getNameOfBook() + "\n" + book_1.getAuthorName() + "\n" + book_1.getYearOfPublication());
        System.out.println();
        System.out.println(book_2.getNameOfBook() + "\n" + book_2.getAuthorName() + "\n" + book_2.getYearOfPublication());
    }
}
