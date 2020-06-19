package algoexpert.graph;

import java.util.*;

public class ShortestPathOf2DArray {

    public static void test()
    {
        char[][] matrix = {
                {'S', '0', '1', '1'},
                {'1', '1', '1', '1'},
                {'0', '1', '0', '1'},
                {'1', '0', 'D', '1'}
        };

        int path = pathExists(matrix);

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(path);
    }

    private static int pathExists(char[][] matrix){
        Queue<Node> myQueue = new LinkedList<>();
        myQueue.add(new Node(0, 0, 0));

        while (!myQueue.isEmpty()){
            Node popped = myQueue.poll();

            if(matrix[popped.x][popped.y] == 'D'){
                return popped.distance;
            } else {
                matrix[popped.x][popped.y] = '0';
                addNeighboursToQueue(matrix, myQueue, popped);
            }
        }

        return 0;
    }

    private static void addNeighboursToQueue(char[][] matrix, Queue<Node> myQueue, Node popped) {
        if(popped.x - 1 > 0 && matrix[popped.x - 1][popped.y] != '0'){
            myQueue.add(new Node(popped.x - 1, popped.y, popped.distance + 1));
        }
        if((popped.x+1 > 0 && popped.x+1 < matrix.length ) && matrix[popped.x+1][popped.y] != '0'){
            myQueue.add(new Node(popped.x + 1, popped.y, popped.distance + 1));
        }
        if((popped.y-1 > 0 && popped.y-1 < matrix.length ) && matrix[popped.x][popped.y-1] != '0'){
            myQueue.add(new Node(popped.x, popped.y-1, popped.distance + 1));
        }
        if((popped.y+1 > 0 && popped.y+1 < matrix.length ) && matrix[popped.x][popped.y+1] != '0'){
            myQueue.add(new Node(popped.x, popped.y+1, popped.distance + 1));
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
