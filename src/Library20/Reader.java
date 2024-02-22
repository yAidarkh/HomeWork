package Library20;

public class Reader {
    private int readerAge;
    private Book borrowedBook;

    public Reader(int readerAge) {
        this.readerAge = readerAge;
    }


    public int getReaderAge() {
        return readerAge;
    }

    public void setReaderAge(int readerAge) {
        this.readerAge = readerAge;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }
}
