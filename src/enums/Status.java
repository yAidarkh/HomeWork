package enums;

public enum Status {
    CREATED("Создан"),
    INPROCESSING("В обработке"),
    ONDELIVERY("На доставке"),
    DELIVERED("Доставлен");

    private final String rusName;

    Status(String rusName) {
        this.rusName=rusName;
    }

    public String getRusName() {
        return rusName;
    }
}
