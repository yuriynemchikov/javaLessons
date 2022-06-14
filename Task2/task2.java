package Task2;
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

    public static void main(String[] args) throws Exception {

        operations();

    }

    public static int inputTheNumbers() throws Exception {
        int n = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Boolean flag = scanner.hasNextInt();
            if (flag) {
                n = scanner.nextInt();
                break;
            }
            else{
                System.out.println("Введите целое число");
            }
        }

        return n;

    }

    public static void operations () throws Exception {

        System.out.println("Введите число a: ");
        int a = inputTheNumbers();
        System.out.println("Введите число b: ");
        int b = inputTheNumbers();

        int c = 2;
        int d = 1;

        StringBuilder ret = new StringBuilder();

        if (a > b) {
            ret.append("нет решения");
            System.out.println(ret);
        }

        else {
            while (b != a) {
                if (b % c == 0 && (b/c >= a)) {
                    b = b / c;
                    ret.insert(0,"k1 ");
                } else {
                    b = b - d;
                    ret.insert(0,"k2 ");
                }
            }

            System.out.println(ret);

        }
    }
}
