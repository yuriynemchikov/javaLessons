package Planner;

import java.util.ArrayList;

public class Data<T> extends ArrayList {

    Task task;
    private ArrayList<T> db;

    public void add(ArrayList<T> db, Task t) {
        db.add((T) t);
    }
}
