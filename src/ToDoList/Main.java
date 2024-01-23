package ToDoList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager(
                tasks(),
                new Epic[]{epic1, epic2, null},
                subtasks()
        );

        Task task = new Task("тестовая задача 1", "описание");
        manager.add(task);

        Epic epic = new Epic("Тестовый эпик", "описание");
        manager.add(epic);

        Subtask subtask = new Subtask("Тестовая подзадача", "описание", epic);
        manager.add(subtask);

        System.out.println(epic1.getStatus());
        Subtask subtask1 = new Subtask("1","1",epic1);
        subtask1.setStatus("DONE");
        manager.checkEpicStatus(epic1);
        System.out.println(epic1.getStatus());
    }

    static Epic epic1 = new Epic("Эпик с двумя подзадачами", "описание");
    static Epic epic2 = new Epic("Эпик без подзадач", "описание");



    static Subtask[] subtasks() {
        return new Subtask[]{
                new Subtask("Подзадача 1", "Описание подзадачи 1", epic1),
                new Subtask("Подзадача 2", "Описание подзадачи 2", epic1),
                null
        };
    }

    static Task[] tasks() {
        return new Task[]{
                new Task("Задача 1", "Описание задачи 1"),
                new Task("Задача 2", "Описание задачи 2"),
                new Task("Задача 3", "Описание задачи 3"),
                null,
                null
        };
    }
}