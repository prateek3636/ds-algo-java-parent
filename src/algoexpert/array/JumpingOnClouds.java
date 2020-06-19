package algoexpert.array;

import java.util.Arrays;

public class JumpingOnClouds {

    public static void test() {
        int[] arr = {0,1,0,0,0,1,0,0};
        int n = findMinimumJump(arr);
        System.out.println(n);
    }

    private static int findMinimumJump(int[] arr){

        if(arr.length == 0){
            return 0;
        }

        if(arr.length > 1 && arr[0] == 1 && arr[1] == 1){
            return 0;
        }

        int jump = 0;
        int index = 0;
        while (index < arr.length - 1 ) {
            if(index+2 == arr.length || arr[index + 2] == 1){
                jump += 1;
                index = index+1;
            }else {
                index = index+2;
                jump += 1;
            }
        }
        return jump;

    }

}
