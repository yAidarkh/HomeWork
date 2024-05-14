package TaskTracker.model;

import TaskTracker.utils.Status;
import TaskTracker.utils.TaskType;

import java.time.Duration;
import java.time.LocalDateTime;

public class SubTask extends Task {
    private final long epicId;

    // for load
    public SubTask(long id, String title, String description, LocalDateTime startTime, Duration duration, Epic epic) {
        super(id, title, description, startTime, duration);
        this.epicId = epic.id;
        this.taskType = TaskType.SUBTASK;
    }
    //for create
    public SubTask(String title, String description, LocalDateTime startTime, Duration duration, Epic epic) {
        super(title, description, startTime, duration);
        this.epicId = epic.id;
        this.taskType = TaskType.SUBTASK;
    }
    //For update
    public SubTask(String title, String description, LocalDateTime startTime, Duration duration, Epic epic, Status status, long epicId) {
        super(title, description, startTime, duration, status);
        this.epicId = epicId;
    }
    public long getEpicId() {
        return epicId;
    }

}
