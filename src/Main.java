import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        var author = new Author("Artur", "Family");
        var author1 = new Author("Artur1", "Family1");
        var author2 = new Author("Artur2", "Family2");
        var book1 = new book("Book1", author, 1923);
        var book2 = new book("Book2", author1, 2003);
        var book3 = new book("Book3", author2, 1925);

        System.out.println(book1.getName()+" "+book1.getAuthor() + " " +book1.getPublicationYear());






    }
}