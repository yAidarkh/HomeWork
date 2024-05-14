package TaskTracker.repository;

import TaskTracker.model.Epic;
import TaskTracker.model.SubTask;
import TaskTracker.model.Task;
import TaskTracker.utils.CSVFormatter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FileManager extends ManagerImpl {
    private static final String TASK_PATH = "src/TaskTracker/resources/Tasks.csv";
    private static final String HISTORY_PATH = "src/TaskTracker/resources/History.txt";

    public void save() {
        try {
            FileWriter writer = new FileWriter(TASK_PATH, false);
            writer.write("id,title,description,type,status,start_time,duration,epic_id\n");
            writer.close();
            for (Map.Entry<Long, Task> entry : taskMap.entrySet()) {
                CSVFormatter.addTaskToFile(entry.getKey(), entry.getValue(), TASK_PATH);
            }
            for (Map.Entry<Long, Epic> entry : epicMap.entrySet()) {
                CSVFormatter.addTaskToFile(entry.getKey(), entry.getValue(), TASK_PATH);
            }
            for (Map.Entry<Long, SubTask> entry : subTaskMap.entrySet()) {
                CSVFormatter.addTaskToFile(entry.getKey(), entry.getValue(), TASK_PATH);
            }

        } catch (IOException e) {
        }
    }

    public static FileManager loadFromFile() {
        FileManager fileManger = new FileManager();
        try {
            BufferedReader br = new BufferedReader(new FileReader(TASK_PATH));
            br.readLine();
            while (br.ready()) {
                String[] line = br.readLine().split(",");
                if (line.length > 1) {
                    switch (line[3]) {
                        case "TASK":
                            Task task = CSVFormatter.fromStringTask(line);
                            fileManger.createTask(task);
                            break;
                        case "SUBTASK":
                            SubTask subTask = CSVFormatter.fromStringSubtask(line, fileManger);
                            fileManger.createSubTask(subTask);
                            break;
                        case "EPIC":
                            Epic epic = CSVFormatter.fromStringEpic(line);
                            fileManger.createEpic(epic);
                            break;
                    }
                    try {
                        for (Map.Entry<Long, SubTask> entry : fileManger.subTaskMap.entrySet()) {
                            fileManger.getEpicById(entry.getValue().getEpicId()).add(entry.getValue());
                        }
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                    }
                    long maxId = 0;
                    for (Map.Entry<Long, Task> entry : fileManger.getAll().entrySet()) {
                        if (entry.getKey() > maxId) {
                            maxId = entry.getKey();
                        }
                    }
                    fileManger.setUniqueId(++maxId);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return fileManger;
    }
}
