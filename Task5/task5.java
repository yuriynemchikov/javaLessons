package Task5;

// +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + 28 = ?4.
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task5 {

//    public static int ScanTheNumbers() {
//        int n = 0;
//        Scanner scanner = new Scanner(System.in);
//        boolean f = false;
//        while (!f) {
//            System.out.println("Введите число: ");
//            f = scanner.hasNextInt();
//            if (f) {
//                n = scanner.nextInt();
//                return n;
//            }
//            scanner.next();
//        }
//        return -1;
//    }

    public static void main(String[] args) throws Exception {

        readFile();
        RegexMatches();

    }

    public static String readFile() throws Exception {

        BufferedReader line = new BufferedReader(new FileReader("input.txt"));
        String Line = line.readLine();

        return Line;

    }


    public static void RegexMatches() {
        String str = "";
        String pattern = "^\\d$";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }
}

