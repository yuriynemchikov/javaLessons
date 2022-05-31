package Task3;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("int n: ");

        try {
            int n = scanner.nextInt();
            scanner.close();
            System.out.println(getNumber(n));
        } catch (Exception e) {
            System.out.println("Ввод неверный");
        }
    }
    public static int getNumber(int n) {
            int result = (n * (n+1))/2;
            return result;
        }
    }

