package HomeWork0401;

import java.time.LocalDate;

public class Practice {
    public static void main(String[] args) {

        User user1 = new User(1, "asd@gmail.com", "asd", LocalDate.of(1998, 12, 8));
        user1.setName("ФЫВ");
        Film film1 = new Film(1, "asd", "asd", 1895, 2);
        Database database = new Database(10, 10);
        database.addUser(user1);
        database.addFilm(film1);
        System.out.println(database.getFilms());
        System.out.println(database.getUsers());
    }
}
