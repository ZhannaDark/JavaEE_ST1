package main.javaee.db;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Tasks> tasks = new ArrayList<>();

    private static int id = 4;

    static {
        tasks.add(
                new Tasks(1,
                        "Study all subjects",
                        "I need to study hardly cuz i wanna take A+",
                        "2023-05-25",
                        "No"
                )
        );
        tasks.add(
                new Tasks(2,
                        "Clean the home",
                        "If I did not my mom will give me a lecture",
                        "2023-04-23",
                        "Yes"
                )
        );
        tasks.add(
                new Tasks(3,
                        "Find a job",
                        "I need to gain experience",
                        "2023-05-30",
                        "No"
                )
        );
    }

    public static ArrayList<Tasks> getAllTasks() {
        return tasks;
    }

    public static void addTask(Tasks tasks) {
        tasks.setId(id);
        DBManager.tasks.add(tasks);
        id++;
    }

    public static Tasks getTask(int id) {
        return tasks
                .stream()
                .filter(tasks -> tasks.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static void updateTask(Tasks dela) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == dela.getId()) {
                tasks.set(i, dela);
                break;
            }
        }
    }

    public static void deleteTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).getId()==id){
                tasks.remove(i);
                break;
            }
        }
    }
}
