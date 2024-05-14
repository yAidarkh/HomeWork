package TaskTracker.model;

import TaskTracker.repository.FileManager;
import TaskTracker.utils.Status;
import TaskTracker.utils.TaskType;

import java.time.Duration;
import java.time.LocalDateTime;

public class Task {
    protected long id;
    protected String title;
    protected String description;
    protected Status status;
    protected TaskType taskType;
    protected LocalDateTime startTime;
    protected Duration duration;
    protected LocalDateTime endTime;

    private static int generatorId = 1;

    // for load
    public Task(long id,String title, String description, LocalDateTime startTime, Duration duration) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = Status.NEW;
        this.duration = duration;
        this.startTime = startTime;
        this.endTime = startTime.plus(duration);
        this.taskType = TaskType.TASK;
    }
    //for create
    public Task(String title, String description, LocalDateTime startTime, Duration duration) {
        this.id = FileManager.getUniqueId();
        this.title = title;
        this.description = description;
        this.status = Status.NEW;
        this.duration = duration;
        this.startTime = startTime;
        this.endTime = startTime.plus(duration);
        this.taskType = TaskType.TASK;
    }
    //For update
    public Task(String title, String description, LocalDateTime startTime, Duration duration, Status status) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.duration = duration;
        this.startTime = startTime;
    }


    protected static void setGeneratorId(int generatorId) {
        Task.generatorId = generatorId;
    }

    public static int getGeneratorId() {
        return generatorId;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder()
                .append(title).append(",")
                .append(description).append(",")
                .append(taskType).append(",")
                .append(status).append(",")
                .append(startTime).append(",")
                .append(duration);
        return stringBuilder.toString();
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
