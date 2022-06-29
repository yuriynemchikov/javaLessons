package Task6;

public class MergeSort {

    public static void main(String[] args) {
        int[] myArray = {2, 45, 12, 3, 5, 1, 21, 9};
        PrintArray(myArray);
        MergeSort(myArray);
        PrintArray(myArray);
    }

    public static void MergeSort(int[] array) {
        if(array.length < 2){
            return;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length-mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i-mid] = array[i];
        }
        MergeSort(left);
        MergeSort(right);
        Merge(array,left,right);
    }

    public static void Merge(int[] targetArray, int[] array1, int[] array2) {
        int array1MinIndex = 0;
        int array2MinIndex = 0;
        int targetArrayMinIndex = 0;

        while (array1MinIndex < array1.length && array2MinIndex < array2.length) {
            if(array1[array1MinIndex] < array2[array2MinIndex]){
                targetArray[targetArrayMinIndex] = array1[array1MinIndex];
                array1MinIndex++;
            }
            else{
                targetArray[targetArrayMinIndex] = array2[array2MinIndex];
                array2MinIndex++;
            }
            targetArrayMinIndex++;
        }
        while(array1MinIndex < array1.length){
            targetArray[targetArrayMinIndex] = array1[array1MinIndex];
            array1MinIndex++;
            targetArrayMinIndex++;
        }
        while (array2MinIndex < array2.length){
            targetArray[targetArrayMinIndex] = array2[array2MinIndex];
            array2MinIndex++;
            targetArrayMinIndex++;
        }

    }

    public static void PrintArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}
