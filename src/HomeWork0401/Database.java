package HomeWork0401;

import java.time.LocalDate;

public class Database {
    private User[] users;
    private Film[] films;

    public User[] getUsers() {
        return users;
    }

    public Film[] getFilms() {
        return films;
    }

    public Database(int usersLenght, int filmsLenght) {
        this.users = new User[usersLenght];
        this.films = new Film[filmsLenght];
    }

    public Boolean validateUser(User user){
        if (user.getBirthDate()==null||user.getBirthDate().isAfter(LocalDate.now())){
            return false;
        }else if(user.getName()==null){
            user.setName(user.getLogin());
        }
        return true;
    }
    public Boolean validateFilm(Film film){
        if(film.getReleaseYear()<1895){
            return false;
        }else if(film.getDuration()<1){
            return false;
        }
        return true;
    }

    public void addUser(User user){
        if(validateUser(user)){
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    users[i] = user;
                    System.out.println("Пользователь успешно добавлен.");
                    return;
                }
            }
        }
        System.out.println("Пользователь не добавлен.");
    }
    public void addFilm(Film film){
        if(validateFilm(film)){
            for (int i = 0; i < films.length; i++) {
                if (films[i] == null) {
                    films[i] = film;
                    System.out.println("Фильм успешно добавлен.");
                    return;
                }
            }
        }
        System.out.println("Фильм не добавлен.");
    }
}
