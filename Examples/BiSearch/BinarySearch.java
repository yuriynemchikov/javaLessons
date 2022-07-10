package Examples.BiSearch;

import java.util.Arrays;

public class BinarySearch {
    int[] myArray;

    @Override
    public String toString(){
        return String.format("%f", myArray);
    }
    public static int bruteSearch(int[] myArray, double key){
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] sortedArray, double key){
        return binarySearchRecursive(sortedArray,key,0,sortedArray.length);
    }

    public static int binarySearchRecursive(int[] sortedArray, double key, int low, int high){
        int middle = (low + high) / 2;

        if (high < low)
            return -1;

        if(key == sortedArray[middle]){
            return middle;
        }
        else if(key < sortedArray[middle]){
            return binarySearchRecursive(sortedArray,key,low,middle-1);
        }
        else{
            return binarySearchRecursive(sortedArray,key,middle+1,high-1);
        }
    }

    public static int[] generateRandomNumbers(int length) {
        int[] myArray = new int[length];
        int a = 0;
        int b = 10;

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = a + (int) (Math.random() * b);
        }
        return myArray;
    }


}
