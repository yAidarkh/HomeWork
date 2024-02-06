package StringBuilder;

public class User {
    private String name;
    private int age;
    private Post[] posts;

    public User(String name, int age, Post[] posts) {
        this.name = name;
        this.age = age;
        this.posts = posts;
    }

    public Post[] getPosts() {
        return posts;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
