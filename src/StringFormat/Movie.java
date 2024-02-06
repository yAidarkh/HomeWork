package StringFormat;

public class Movie {
    private String title;
    private int realeseYear;
    private String genre;

    public Movie(String title, int realeseYear, String genre) {
        this.title = title;
        this.realeseYear = realeseYear;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRealeseYear() {
        return realeseYear;
    }

    public void setRealeseYear(int realeseYear) {
        this.realeseYear = realeseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
