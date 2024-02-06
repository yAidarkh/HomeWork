package StringFormat;

public class Main {
    public static void main(String[] args) {
        Movie[] movies = new Movie[]{
                new Movie("1",1,"1"),
                new Movie("2",2,"2"),
                new Movie("3",3,"3"),
                new Movie("4",4,"4"),
                new Movie("5",5,"5"),
        };
        for (Movie movie : movies) {
            System.out.printf("Фильм: %s, вышел %d году, жанр: %s\n",movie.getTitle(),movie.getRealeseYear(),movie.getGenre());
        }
    }
}
