package Library;

public class ReaderImp implements Reader {
    private String name;
    private Book borrowedBook;
    private int days;

    @Override
    public void takeBook(String book, Library library, AdministratorImp administratorImp) {
        administratorImp.giveBook(book, library, this);
    }

    @Override
    public void returnBook(Book book, Library library, AdministratorImp administratorImp) {
        if (administratorImp.takeBook(book, library)) {
            this.setBorrowedBook(null);
        }
    }

    public ReaderImp(String name, Book borrowedBook, int days) {
        this.name = name;
        this.borrowedBook = borrowedBook;
        this.days = days;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
