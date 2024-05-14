package TaskTracker;

import TaskTracker.model.Epic;
import TaskTracker.model.SubTask;
import TaskTracker.model.Task;
import TaskTracker.repository.FileManager;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FileManager fileManger = FileManager.loadFromFile();
        LocalDateTime localDateTime = LocalDateTime.now();
        Duration duration = Duration.ofDays(1);
//        fileManger.createTask(new Task("task1","someDescription",localDateTime,duration));
//        Epic epic = new Epic("task1","someDescription",localDateTime,duration);
//        fileManger.createEpic(epic);
//        fileManger.createSubTask(new SubTask("task1","someDescription",localDateTime,duration,epic));
//        fileManger.createTask(new Task("task2","someDescription",localDateTime,duration));

//        for (Map.Entry<Long, Task> entry : fileManger.getAll().entrySet()) {
//            System.out.println(entry.getKey() + "," + entry.getValue());
//       }
        System.out.println(fileManger.getEpicById(2));
        Epic epic = new Epic("avx",null,null,null,null,null);
        fileManger.update(2,epic);
        System.out.println(fileManger.getEpicById(2));
        fileManger.save();








//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.println("""
//                    1. Считать задачи.
//                    2. Сохранить задачи.
//                    3. Просмотреть задачу.
//                    4. Обновить задачу.
//                    5. Создать задачу.
//                    0. Выйти.
//                    """);
//            try {
//                System.out.println("Выебриет свой вариант: ");
//                long getAnswer = Long.parseLong(scanner.nextLine());
//
//            }catch (NumberFormatException e){
//                System.out.println("Неправильно введено число. Программа остановлена.");
//                break;
//            }
//
//        }
    }
}
