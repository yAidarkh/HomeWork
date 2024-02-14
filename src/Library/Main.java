package Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(new Book[]{
                new Book("1", "1"),
                new Book("2", "2"),
                new Book("3", "3"),
                new Book("4", "4"),
                new Book("5", "5"),
                null,
                null,
        });
        AdministratorImp administratorImp = new AdministratorImp();
        LibrarianImp librarianImp = new LibrarianImp();
        SupplierImp supplierImp = new SupplierImp("Вася");
        ReaderImp readerImp = new ReaderImp("Боря",null,0);
        librarianImp.orderBook(new Book("6","6"),library,supplierImp);
        readerImp.takeBook("1",library,administratorImp);
        administratorImp.overdueNotification(readerImp,library);
        readerImp.returnBook(readerImp.getBorrowedBook(),library,administratorImp);
    }
}
