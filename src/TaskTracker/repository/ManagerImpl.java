package TaskTracker.repository;

import TaskTracker.model.Epic;
import TaskTracker.model.SubTask;
import TaskTracker.model.Task;
import TaskTracker.utils.Status;
import TaskTracker.utils.TaskType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerImpl implements Manager {

    protected Map<Long, Task> taskMap = new HashMap<>();
    protected Map<Long, SubTask> subTaskMap = new HashMap<>();
    protected Map<Long, Epic> epicMap = new HashMap<>();


    private static long uniqueId = 1;

    @Override
    public Map<Long, Task> getAll() {
        Map<Long,Task> allTasks = new HashMap<>();
        allTasks.putAll(taskMap);
        allTasks.putAll(subTaskMap);
        allTasks.putAll(epicMap);
        return allTasks;
    }

    @Override
    public void deleteAll() {
        taskMap = new HashMap<>();
        subTaskMap = new HashMap<>();
        epicMap = new HashMap<>();
    }

    @Override
    public Task getTaskById(long id) {
        return taskMap.get(id);
    }

    @Override
    public SubTask getSubTaskById(long id) {
        return subTaskMap.get(id);
    }

    @Override
    public Epic getEpicById(long id) {
        return epicMap.get(id);
    }

    @Override
    public void createTask(Task task) {
        taskMap.put(task.getId(), task);
    }

    @Override
    public void createSubTask(SubTask subTask) {
        subTaskMap.put(subTask.getId(), subTask);
    }

    @Override
    public void createEpic(Epic epic) {
        epicMap.put(epic.getId(), epic);
    }

    @Override
    public void update(long id, Task task) {
        if (getTaskById(id) != null) {
            if (task.getTitle()!=null){
                getTaskById(id).setTitle(task.getTitle());
            } else if (task.getDescription()!=null) {
                getTaskById(id).setDescription(task.getDescription());
            } else if (task.getStartTime()!=null&&task.getDuration()!=null) {
                getTaskById(id).setStartTime(task.getStartTime());
                getTaskById(id).setDuration(task.getDuration());
                getTaskById(id).setEndTime(task.getStartTime().plus(task.getDuration()));
            } else if (task.getStatus()!=null) {
                getTaskById(id).setStatus(task.getStatus());
            }
        } else if (getSubTaskById(id) != null) {
            if (task.getTitle()!=null){
                getSubTaskById(id).setTitle(task.getTitle());
            } else if (task.getDescription()!=null) {
                getSubTaskById(id).setDescription(task.getDescription());
            } else if (task.getStartTime()!=null&&task.getDuration()!=null) {
                getSubTaskById(id).setStartTime(task.getStartTime());
                getSubTaskById(id).setDuration(task.getDuration());
                getSubTaskById(id).setEndTime(task.getStartTime().plus(task.getDuration()));
            } else if (task.getStatus()!=null) {
                getSubTaskById(id).setStatus(task.getStatus());
                getEpicById(subTaskMap.get(id).getEpicId()).setStatus(Status.IN_PROGRESS);
            }
        } else if (getEpicById(id) != null) {
            if (task.getTitle()!=null){
                getEpicById(id).setTitle(task.getTitle());
            } else if (task.getDescription()!=null) {
                getEpicById(id).setDescription(task.getDescription());
            } else if (task.getStartTime()!=null&&task.getDuration()!=null) {
                getEpicById(id).setStartTime(task.getStartTime());
                getEpicById(id).setDuration(task.getDuration());
                getEpicById(id).setEndTime(task.getStartTime().plus(task.getDuration()));
            } else if (task.getStatus()!=null) {
                getEpicById(id).setStatus(task.getStatus());
            }
        }
    }

    @Override
    public void deleteById(long id) {
        if (getTaskById(id) != null) {
            taskMap.remove(id);
        } else if (getSubTaskById(id) != null) {
            subTaskMap.remove(id);
        } else if (getEpicById(id) != null) {
            epicMap.remove(id);
        }
    }

    public static long getUniqueId() {
        return uniqueId++;
    }

    public static void setUniqueId(long uniqueId) {
        ManagerImpl.uniqueId = uniqueId;
    }
}
