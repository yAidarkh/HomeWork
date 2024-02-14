package Library;


public class AdministratorImp implements Administrator {
    @Override
    public int findBook(String title, Library library) {
        Book[] books = library.getBooks();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                System.out.printf("Книга: %s есть в библиотеке под номером %d\n", books[i].getTitle(), i);
                return i;
            }
        }
        return -1;
    }

    @Override
    public void overdueNotification(ReaderImp readerImp, Library library) {
        if (readerImp.getDays() > 5) {
            readerImp.returnBook(readerImp.getBorrowedBook(), library, this);
        }
    }

    @Override
    public boolean takeBook(Book book, Library library) {
        for (int i = 0; i < library.getBooks().length; i++) {
            if (library.getBooks()[i] == null) {
                library.getBooks()[i] = book;
                System.out.printf("Книга %s помещена в библиотку.\n", book.getTitle());
                return true;
            }
        }
        System.out.println("В библиотеке нет места");
        return false;
    }


    @Override
    public void giveBook(String book, Library library, ReaderImp readerImp) {
        int bookPosition = findBook(book, library);
        if (bookPosition != -1) {
            if (readerImp.getBorrowedBook() == null) {
                readerImp.setBorrowedBook(library.getBooks()[bookPosition]);
                Book[] books = library.getBooks();
                books[bookPosition] = null;
                library.setBooks(books);
                System.out.printf("Читатель %s взял кигу %s.\n", readerImp.getName(), book);
            } else {
                System.out.printf("У читателя %s уже есть книга.\n", readerImp.getName());
            }
        } else {
            System.out.printf("Книги %s нету в библиотеке", book);
        }
    }
}
