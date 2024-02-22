package Library20;

public class Book {
    private String title;
    private int releaseYear;
    private int quantity;
    private int ageSec;

    public Book(String title, int releaseYear, int quantity, int ageSec) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.quantity = quantity;
        this.ageSec = ageSec;
    }

    public int getAgeSec() {
        return ageSec;
    }

    public void setAgeSec(int ageSec) {
        this.ageSec = ageSec;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
