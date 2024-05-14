package TaskTracker.utils;

import TaskTracker.model.Epic;
import TaskTracker.model.SubTask;
import TaskTracker.model.Task;
import TaskTracker.repository.FileManager;


import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

public class CSVFormatter {
    public static void addTaskToFile(long id,Task task, String path) {
        try {
            FileWriter writer = new FileWriter(path, true);
            writer.write(id+",");
            writer.write(task.toString());
            if (task.getTaskType().equals(TaskType.SUBTASK)){
                SubTask subTask = (SubTask) task;
                writer.write("," + subTask.getEpicId() + "\n");
            }else {
                writer.write("\n");
            }
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static Task fromStringTask(String[] line){
        Task task = new Task(Long.parseLong(line[0]),line[1],line[2], LocalDateTime.parse(line[5]), Duration.parse(line[6]));
        return task;
    }
    public static SubTask fromStringSubtask(String[] line,FileManager fileManager){
        SubTask task = new SubTask(Long.parseLong(line[0]),line[1],line[2], LocalDateTime.parse(line[5]), Duration.parse(line[6]), fileManager.getEpicById(Long.parseLong(line[7])));
        return task;
    }
    public static Epic fromStringEpic(String[] line){
        Epic task = new Epic(Long.parseLong(line[0]),line[1],line[2], LocalDateTime.parse(line[5]), Duration.parse(line[6]));
        return task;
    }
}
