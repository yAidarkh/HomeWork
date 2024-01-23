package ToDoList;

public class Subtask extends Task {
    private final Epic epic;

    public Subtask(String title, String description, Epic epic) {
        super(title, description);
        this.epic = epic;
        epic.add(this);
    }

    public Epic getEpic() {
        return epic;
    }
}
