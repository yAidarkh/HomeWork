package enums.Books;

public class FromArchivedStatusMover extends BookMover{
    @Override
    public boolean bookMover(Book book, Status status){
        if(status==Status.AVIABLE){
            book.setStatus(status);
            return true;
        }
        return false;
    }
}
