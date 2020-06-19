package algoexpert.array;

import java.util.Arrays;

public class FindMedian {

    public static void test() {
        int[] arr = {-1, 5, 13, 8, 2, 3, 3, 1};
        printMedian(arr);
    }

    private static void printMedian(int[] arr){

        for(int i=0; i<arr.length-2; i++){

            int[] nArr = Arrays.copyOfRange(arr, i,i+3);
            int[] sArr = Arrays.copyOfRange(nArr, 0, 3);
            Arrays.sort(sArr);
            System.out.println(sArr[1] + "<- median of" + Arrays.toString(nArr));
        }
    }
}
