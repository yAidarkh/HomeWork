package Media;

public class Media {
    String name;
    int releaseYear;

    public Media(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }
    public void play() {
        System.out.println("Проигрываем фильм:");
        System.out.println("    Название: " + name);
        System.out.println("    Год выпуска: "+releaseYear);
    }
}
