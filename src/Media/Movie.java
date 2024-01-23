package Media;

public class Movie extends Media{
    double rating;
    double duration;

    public Movie(String name, int releaseYear, double rating, double duration) {
        super(name, releaseYear);
        this.rating=rating;
        this.duration=duration;
    }
    @Override
    public void play(){
        super.play();
        System.out.println("    Рейтинг: "+rating);
        System.out.println("    Длительность: "+duration);
    }
}
