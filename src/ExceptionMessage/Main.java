package ExceptionMessage;

public class Main {
    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");

    }
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Начало2", 0, 16),
                new Movie("Начало3", 2010, 16),
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Анна Каренина2", 2017, 16),
                new Theatre("", 2017, 16),
        };
    }
    public static void validEvent(Event event){
        if(event.getAge()==0||event.getReleaseYear()==0||event.getTitle().isBlank()){
            System.out.println(event);
            throw new RuntimeException("Не все события верны");
        }
    }
}
