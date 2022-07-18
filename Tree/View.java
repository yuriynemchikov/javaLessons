package Tree;

import java.time.Period;
import java.util.Scanner;

public class View {
    static Scanner scan = new Scanner(System.in);

    public static int getRequest(String number){
        System.out.printf("%s", number);
        return scan.nextInt();
    }

    public static String getName(String p){
        System.out.printf("%s", p);
        return scan.next();
    }

}
