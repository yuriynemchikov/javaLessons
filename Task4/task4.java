// Написать программу, показывающую последовательность действий для игры “Ханойская башня”
package Task4;

import java.util.Scanner;

public class task4 {

    public static int ScanTheNumbers() {
        int n = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество дисков: ");
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

    public static void hanoi(int n, int i, int j){

        if (n == 1){
            System.out.printf("%d -> %d\n", i, j);
        }
        else {
            int temp = 6 - i - j;
            hanoi (n-1, i, temp);
            System.out.printf("%d -> %d\n", i, j);
            hanoi(n-1, temp, j);

        }
    }

    public static void main(String[] args) {
        int n = ScanTheNumbers();
        int i = 1;
        int j = 2;

        hanoi(n, i, j);
    }
}
