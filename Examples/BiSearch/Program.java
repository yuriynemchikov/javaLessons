package Examples.BiSearch;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] myArray = BinarySearch.generateRandomNumbers(10);
        for (int i = 0; i < myArray.length; i++){
            System.out.printf(myArray[i]+ " ");
        }
        System.out.println();

        Arrays.sort(myArray);

        for (int i = 0; i < myArray.length; i++){
            System.out.printf(myArray[i]+ " ");
        }
        System.out.println();
        System.out.println(BinarySearch.bruteSearch(myArray, 3));

        System.out.println(BinarySearch.binarySearchRecursive(myArray,3));
    }
}
