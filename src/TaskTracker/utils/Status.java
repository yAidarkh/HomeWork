package TaskTracker.utils;

public enum Status {
    IN_PROGRESS("В процессе."),
    NEW("Создан."),
    DONE("Завершено.");
    private final String rusName;

    Status(String rusName) {
        this.rusName=rusName;
    }

    public String getRusName() {
        return rusName;
    }
}
