package Data.HomeWork;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Friend {
    private String name;
    private LocalDate birthday;

    public Friend(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "%s - %d %s %d".formatted(getName(), getBirthday().getDayOfMonth(), getBirthday().getMonth().getDisplayName(TextStyle.FULL, Locale.of("ru")), getBirthday().getYear());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
