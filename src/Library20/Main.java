package Library20;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(new Book[100]);
        library.addBook(new Book("1", 1, 3, 17));
        library.addBook(new Book("2", 3, 1, 71));
        library.addBook(new Book("3", 1, 1, 18));
        library.addBook(new Book("4", 1, 1, 30));
        Reader reader = new Reader(18);
        library.giveBook("3", reader);
        Reader reader1 = new Reader(72);
        library.giveBook("3", reader1);

    }
}
