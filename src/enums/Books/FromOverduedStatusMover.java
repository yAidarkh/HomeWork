package enums.Books;

public class FromOverduedStatusMover extends BookMover{
    @Override
    public boolean bookMover(Book book, Status status){
        if(status==Status.AVIABLE||status==Status.ARCHIVED){
            book.setStatus(status);
            return true;
        }
        return false;
    }
}
