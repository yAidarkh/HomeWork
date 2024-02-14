package Library;

public interface Reader {
    public void takeBook(String book, Library library, AdministratorImp administratorImp);

    public void returnBook(Book book, Library library, AdministratorImp administratorImp);
}
