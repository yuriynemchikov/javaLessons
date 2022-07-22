package Planner;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<Task> db = new ArrayList<>();
    private Task t;

    public DataBase(ArrayList<Task> db, Task t) {
        this.db = db;
        this.t = new Task(1,"","", Priority.LOW);
    }



    public DataBase() {

    }

    public void add(Task task) {
        db.add(task);
    }

    @Override
    public String toString() {
        return String.format("id: %d, Дата добавления: %s, Дедлайн: %s, Автор задачи: %s, Приоритет: %s", t.getId(), t.getDateOfAdd(),
                t.getDeadline(), t.getName(), t.getLevel());
    }

}
