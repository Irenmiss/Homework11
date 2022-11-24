package Homework11;

public class Main {
    public static void main(String[] args) {
        Author author_1 = new Author("Клайв С.", "Льюис");
        Book book_1 = new Book("Лев, колдунья и платяной шкаф", author_1, 1950);
        Author author_2 = new Author("Айра", "Левин");
        Book book_2 = new Book("День совершенства", author_2, 2000);
        Book book_3 = new Book("День совершенства", author_2, 2005); // тест equals
        book_1.setYearOfPublication(2007);
        System.out.println(book_1 + "\n" + book_2);

//        System.out.println(author_1);
//        System.out.println(book_2.equals(book_3)); // тест equals
//        System.out.println(book_1.hashCode() + "\n" + book_2.hashCode() + "\n" + book_3.hashCode()); // вывод хэш-кодов
    }
}
