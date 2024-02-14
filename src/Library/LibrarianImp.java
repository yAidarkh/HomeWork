package Library;

public class LibrarianImp implements Librarian, Administrator {
    @Override
    public int findBook(String title, Library library) {
        AdministratorImp administratorImp = new AdministratorImp();
        int answer = administratorImp.findBook(title, library);
        return answer;
    }

    @Override
    public void overdueNotification(ReaderImp readerImp, Library library) {
        AdministratorImp administratorImp = new AdministratorImp();
        administratorImp.overdueNotification(readerImp, library);
    }

    @Override
    public void giveBook(String book, Library library, ReaderImp readerImp) {
        AdministratorImp administratorImp = new AdministratorImp();
        administratorImp.giveBook(book, library, readerImp);
    }

    @Override
    public boolean takeBook(Book book, Library library) {
        AdministratorImp administratorImp = new AdministratorImp();
        return administratorImp.takeBook(book, library);
    }

    @Override
    public void orderBook(Book book, Library library,SupplierImp supplierImp) {
        supplierImp.addBookToLibrary(book, library);
    }
}
