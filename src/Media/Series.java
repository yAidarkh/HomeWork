package Media;

public class Series extends Movie {
    int seriesCount;
    public Series(String name, int releaseYear, double rating, double duration, int seriesCount) {
        super(name, releaseYear,rating,duration);
        this.seriesCount=seriesCount;
    }
    @Override
    public void play(){
        super.play();
        System.out.println("    Количество серий: "+seriesCount);
    }
}
