package TaskTracker.model;

import TaskTracker.utils.Status;
import TaskTracker.utils.TaskType;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Epic extends Task {
    private final List<SubTask> subtasks;

    // for load
    public Epic(long id, String title, String description, LocalDateTime startTime, Duration duration) {
        super(id, title, description, startTime, duration);
        this.subtasks = new ArrayList<>();
        this.taskType = TaskType.EPIC;
    }
    //for create
    public Epic(String title, String description, LocalDateTime startTime, Duration duration) {
        super(title, description, startTime, duration);
        this.subtasks = new ArrayList<>();
        this.taskType = TaskType.EPIC;
    }
    //For update
    public Epic(String title, String description, LocalDateTime startTime, Duration duration, Status status, List<SubTask> subtasks) {
        super(title, description, startTime, duration, status);
        this.subtasks = subtasks;
    }

    public void add(SubTask subtask) {
        subtasks.add(subtask);
    }

    public List<SubTask> getSubtasks() {
        return subtasks;
    }
}
