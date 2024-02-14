package Library;

public class SupplierImp implements Supplier, Reader {
    private String name;
    @Override
    public void takeBook(String book, Library library, AdministratorImp administratorImp) {
        ReaderImp readerImp = new ReaderImp("", null, 0);
        readerImp.takeBook(book, library, administratorImp);
    }

    @Override
    public void returnBook(Book book, Library library, AdministratorImp administratorImp) {
        ReaderImp readerImp = new ReaderImp(name, null, 0);
        readerImp.returnBook(book, library, administratorImp);
    }

    @Override
    public void addBookToLibrary(Book book, Library library) {
        AdministratorImp administratorImp = new AdministratorImp();
        administratorImp.takeBook(book, library);
    }

    public SupplierImp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
