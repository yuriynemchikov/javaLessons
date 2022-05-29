// На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить в с раза, а умножается на c
// - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1. 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 
// *Подумать над тем, как сделать минимальное количество команд


import java.util.Scanner;


public class task2 {

    public static void main(String[] args) {
        // input the numbers
        Scanner scanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int a = scanner.nextInt();
        System.out.printf("int b: ");
        int b = scanner.nextInt();
        int c = 2;
        int d = 1;

        System.out.printf("c = %d, d =  %d \n", c, d);
        scanner.close();

        String result = new String();

        if (a > b) {
            result = "нет решения";
            System.out.printf(result);
        }

        else {
            while (b != a) {
                if (b % c == 0 && (b/c >= a)) {
                    b = b / c;
                    result += "k1, ";
                } else {
                    b = b - d;
                    result += "k2, ";
                }
            }
            String delimeter = ", ";
            String[] subStr;
            subStr = result.split(delimeter);


            for(int i = subStr.length - 1; i >= 0; i--) {
                System.out.printf(subStr[i] + ", ");
                System.out.println();
            }

        }

    }
}
