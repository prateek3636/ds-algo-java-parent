package algoexpert.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumPathSum {
    //link: https://www.youtube.com/watch?v=ItjZdu6jEMs
    public static void test()
    {
        int[][] matrix = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        int path = getShortestPath(matrix);

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(path);
    }

    private static int getShortestPath(int[][] matrix){

        // intiating new array of same size

        int[][] dp = new int[matrix.length] [matrix[0].length];

        for(int i = 0; i < dp.length; i++){
            for (int j = 0; j < dp[i].length; j++){
                dp[i][j] += matrix[i][j];

                if( i>0 && j>0){
                    dp[i][j] += Math.min(dp[i-1][j], dp[i][j-1]);
                }
                else if(i>0){
                    dp[i][j] += dp[i-1][j];
                }
                else if(j>0){
                    dp[i][j] += dp[i][j-1];
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }




}
