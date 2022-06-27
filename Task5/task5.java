package Task5;

// +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + 28 = ?4.
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Arrays;

public class task5 {

    public static void main(String[] args) {
        String input = "?4 + 45 = 6?";

        // remove spaces if they exist
        input = input.replace(" ", "");

        // count question marks
        int questionCount = getQuestionMarksCount(input);
        int[] vector = new int[questionCount];
        Arrays.fill(vector, 0);

        // brute force all vector combination 0..0 to 9..9 and check equation
        boolean found = false;
        boolean finish = false;
        while (!finish) {
            String equation = replaceQuestions(input, vector);
            if (isValid(equation)) {
                System.out.println(equation);
                found = true;
            }

            boolean changed = rollVector(vector);
            if (!changed) {
                finish = true;
            }
        }
        if (!found) {
            System.out.println("There is no option to get valid equation " + input);
        }
    }

    private static boolean isValid(String equation) {
        // parse as q+w=e, split on + or =
        String[] parts = equation.split("\\+|=");

        int q = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);
        int e = Integer.parseInt(parts[2]);

        return q + w == e;
    }

    private static String replaceQuestions(String input, int[] vector) {
        char[] chars = input.toCharArray();
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                chars[i] = Character.forDigit(vector[index], 10);
                index++;
            }
        }
        return new String(chars);
    }

    private static boolean rollVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            int digit = vector[i];
            if (digit < 9) {
                vector[i] = digit + 1;
                return true;
            }
            vector[i] = 0;
        }
        return false;
    }

    private static int getQuestionMarksCount(String input) {
        int count = 0;
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '?') {
                count++;
            }
        }
        return count;
    }

}

