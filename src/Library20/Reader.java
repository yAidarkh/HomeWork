package Library20;

public class Reader {
    private int readerAge;
    private Book borrowedBook;

    public Reader(int readerAge) {
        this.readerAge = readerAge;
    }
    public void takeBook(int bookIndex, Library library){
        Book book = library.getBooks()[bookIndex];
        if(book.getQuantity()<=0){
            throw new RuntimeException("Такой книги нету, закончились.");
        }else if (book.getAgeSec()>readerAge){
            throw new RuntimeException("Вы слишком молоды.");
        }else if (borrowedBook!=null) {
            throw new RuntimeException("У вас уже есть книга.");
        }
        library.getBooks()[bookIndex].setQuantity(book.getQuantity()-1);
        borrowedBook=book;
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
