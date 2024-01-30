package enums.Books;

public class FromAviableStatusMover extends BookMover{
    @Override
    public boolean bookMover(Book book, Status status){
        if(status==Status.BORROWED||status==Status.ARCHIVED){
            book.setStatus(status);
            return true;
        }
        return false;
    }
}
