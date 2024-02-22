package Library20;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }
    public void addBook(Book book){
        if(book.getTitle().isBlank()||book.getQuantity()<=0||book.getReleaseYear()<=0||book.getAgeSec()<=0){
            throw new RuntimeException("Некоторые поля книги некорректно заполнены");
        }
        for (int i = 0; i < books.length; i++) {
            if(books[i]==null){
                books[i]=book;
                return;
            }
        }
    }
    public void giveBook(int bookIndex, Reader reader){
        Book book = books[bookIndex];
        if(book.getQuantity()<=0){
            throw new RuntimeException("Такой книги нету, закончились.");
        }else if (book.getAgeSec()> reader.getReaderAge()){
            throw new RuntimeException("Вы слишком молоды.");
        }else if (reader.getBorrowedBook()!=null) {
            throw new RuntimeException("У вас уже есть книга.");
        }
        books[bookIndex].setQuantity(book.getQuantity()-1);
        reader.setBorrowedBook(book);
    }
    public int findBook(String title){
        for (int i = 0; i < books.length; i++) {
            if(books[i].getTitle().equals(title)){
                return i;
            }
        }
        return -1;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

}
