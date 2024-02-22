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
