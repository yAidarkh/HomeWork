package TaskTracker.repository;

import TaskTracker.model.Epic;
import TaskTracker.model.SubTask;
import TaskTracker.model.Task;
import java.util.Map;

public interface Manager {
    Map<Long, Task> getAll();

    void deleteAll();

    Task getTaskById(long id);
    SubTask getSubTaskById(long id);
    Epic getEpicById(long id);

    void createTask(Task task);
    void createSubTask(SubTask subTask);
    void createEpic(Epic epic);

    void update(long id, Task task);
    void deleteById(long id);
}
