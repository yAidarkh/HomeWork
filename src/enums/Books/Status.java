package enums.Books;

public enum Status {
    BORROWED (new FromBorrowedStatusMover()),
    ARCHIVED (new FromArchivedStatusMover()),
    AVIABLE (new FromAviableStatusMover()),
    OVERDUED (new FromOverduedStatusMover());
    private final BookMover bookMover;


    Status(BookMover bookMover) {
        this.bookMover = bookMover;
    }

    public BookMover getBookMover() {
        return bookMover;
    }
}
