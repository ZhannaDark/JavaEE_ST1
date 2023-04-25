package main.javaee.db;

public class Tasks {

    private int id;
    private String name;
    private String description;
    private String deadlineDate;
    private String isDone;


    public Tasks(){

    }

    public Tasks(int id, String name, String description, String deadlineDate, String isDone) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadlineDate = deadlineDate;
        this.isDone = isDone;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public String getIsDone() { return isDone; }

    public void setIsDone(String isDone) { this.isDone = isDone; }

}
