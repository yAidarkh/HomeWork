package StringBuilder;

public class Post {
    private String title;
    private String postedAt;

    public Post(String title, String postedAt) {
        this.title = title;
        this.postedAt = postedAt;
    }

    public String getTitle() {
        return title;
    }

    public String getPostedAt() {
        return postedAt;
    }
}
