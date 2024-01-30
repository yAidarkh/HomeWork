package enums.Books;

public class Practice {
    public static void main(String[] args) {
        Book book1 = new Book("1");
        BookMover bookMover = new BookMover();
        bookMover.bookMenu(book1);
    }
}
