package Planner;

import java.util.ArrayList;

public class Data {

    Task task;
    private ArrayList<Task> db = new ArrayList<>();

    public Data() {}

    public void add(Task t) {
        db.add(t);
    }

    @Override
    public String toString() {
        return String.format("id: %d, Дата добавления: %s, Дедлайн: %s, Автор задачи: %s, Приоритет: %s", task.getId(), task.getDateOfAdd(),
                task.getDeadline(), task.getName(), task.getLevel());
    }

}
