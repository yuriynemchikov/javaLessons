package Planner;

import java.util.ArrayList;

public class Printer<T> {

    public void print(ArrayList<T> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i));
        }
    }
}
