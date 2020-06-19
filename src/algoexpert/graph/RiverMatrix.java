package algoexpert.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RiverMatrix {

    public static void test()
    {
        int[][] matrix = {
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0},
                {1, 0, 1, 1, 0}
        };

//        int path = pathExists(matrix);

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
//        System.out.println(path);
        getRiverSize(matrix);
    }

    static void getRiverSize(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(ints[j]);
            }
        }
    }

    static class Node {
        int x, y, distance;
        Node(int x, int y, int distance){
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}
