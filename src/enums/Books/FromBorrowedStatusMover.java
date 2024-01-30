package enums.Books;

public class FromBorrowedStatusMover extends BookMover{
    @Override
    public boolean bookMover(Book book, Status status){
        if(status==Status.OVERDUED||status==Status.ARCHIVED){
            book.setStatus(status);
            return true;
        }
        return false;
    }
}
