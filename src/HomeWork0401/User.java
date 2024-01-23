package HomeWork0401;

import java.time.LocalDate;

public class User {
    private int id;
    private String email;
    private String login;
    private String name;
    private LocalDate birthDate;

    public User(int id, String email, String login,LocalDate birthDate ) {
        this.id = id;
        this.email = email;
        this.login = login;
        this.birthDate=birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }
}
