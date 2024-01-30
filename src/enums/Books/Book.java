package enums.Books;

public class Book {
    private String title;
    private Status status;

    public Book(String title) {
        this.title = title;
        this.status = Status.AVIABLE;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
