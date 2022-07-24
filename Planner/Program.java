package Planner;

import java.util.ArrayList;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Printer p = new Printer();
        Data db = new Data();

        Task t1 = new Task( "20.07.2022", "25.07.2022", "Yura", Priority.HIGH);
        Task t2 = new Task("24.07.2022", "31.08.2022", "Ara", Priority.LOW);
        db.add(t1);
        db.add(t2);

        p.print(db);
    }
}
