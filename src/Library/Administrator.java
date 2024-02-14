package Library;

public interface Administrator {
    public int findBook(String title,Library library);
    public void giveBook(String book, Library library, ReaderImp readerImp);
    public void overdueNotification(ReaderImp readerImp,Library library);
    public boolean takeBook(Book book, Library library);

}
