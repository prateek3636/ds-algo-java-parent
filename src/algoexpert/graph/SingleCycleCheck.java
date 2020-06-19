package algoexpert.graph;

import java.util.Arrays;
import java.util.HashMap;

public class SingleCycleCheck {

    public static void test()
    {
        int[] arr = {2,3,1,-4,-4,2};

//        int path = pathExists(matrix);

        System.out.println(Arrays.toString(arr));
        boolean isCycle = isSingleCycle(4, arr);
        System.out.println(isCycle);
    }

    private static boolean isSingleCycle(int index, int[] arr){
        int numberOfVisited = 0;
        int currentIdx = index;
        while (numberOfVisited < arr.length){
            if(numberOfVisited > currentIdx && currentIdx == index){
                return false;
            }
            numberOfVisited++;
            currentIdx = getCurrentIdx(currentIdx, arr);
        }
        return currentIdx == index;

    }

    private static int getCurrentIdx(int currentIdx, int [] arr){
        int jump = arr[currentIdx];
        int next = (currentIdx+jump) % arr.length;
        return next >= 0? next : next+arr.length;
    }
}
