package enums.Books;

public enum Status {
    BORROWED ("Взята"),
    ARCHIVED("Архив"),
    AVIABLE("Доступна"),
    OVERDUED ("Просрочена");
    private final String rusName;


    Status(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        return rusName;
    }
}
