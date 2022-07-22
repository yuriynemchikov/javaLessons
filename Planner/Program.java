package Planner;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Printer p = new Printer();
        Data db = new Data();

        Task t1 = new Task(1, "20.07.2022", "25.07.2022", "Yura", Priority.HIGH);
        db.add(t1);

        p.print(db);



    }
}
