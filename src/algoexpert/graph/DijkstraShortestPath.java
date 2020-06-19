package algoexpert.graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

//Link : https://www.youtube.com/watch?v=wQIb1NonMIM
public class DijkstraShortestPath {

    private static void findShortestPath(GraphWithAdMatrix graph, int n){

        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[0] = 0;

        //this will trace the path of vertexes
        HashMap<Integer, Integer> parentPath = new HashMap<>();
        parentPath.put(0, null);

        for(int i=0; i<n-1; i++){
            int minVertex = findMinVertex(visited, distances, n);
            visited[minVertex] = true;
            for(int j=0; j<n; j++){
                if(graph.getAdjMatrix()[minVertex][j] !=0 && !visited[j]){
                    int dist = distances[minVertex] + graph.getAdjMatrix()[minVertex][j];

                    if( dist < distances[j]){
                        distances[j] = dist;
                        parentPath.put(j, minVertex);
                    }
                }
            }
        }

        for (int i=0 ; i<n; i++){
            System.out.println("vertex "+ i + " >>> " + distances[i]);
        }

        parentPath.forEach((K,V) -> System.out.println(K + " is parent of : " + V));


    }

    private static int findMinVertex(boolean[] visited, int[] distances, int n){

        int min_vertex = -1;

        for(int i=0; i<n ; i++){
            if( !visited[i] && (min_vertex == -1 || distances[i] < distances[min_vertex])){
                min_vertex = i;
            }
        }

        return min_vertex;
    }



    public static void test() {
        GraphWithAdMatrix g = new GraphWithAdMatrix(5);

        g.addEdge(0, 1, 4);
        g.addEdge(0, 2, 8);
        g.addEdge(1, 0, 4);
        g.addEdge(1, 2, 2);
        g.addEdge(1, 3, 5);
        g.addEdge(2, 0, 8);
        g.addEdge(2, 1, 2);
        g.addEdge(2, 3, 5);
        g.addEdge(2, 4, 9);
        g.addEdge(3, 1, 5);
        g.addEdge(3, 2, 5);
        g.addEdge(3, 4, 4);
        g.addEdge(4, 2, 9);
        g.addEdge(4, 3, 4);


        for (int i = 0; i < g.getAdjMatrix().length; i++) {
            for (int j = 0; j < g.getAdjMatrix()[i].length; j++) {
                System.out.print(g.getAdjMatrix()[i][j] + " ");
            }
            System.out.println();
        }

        findShortestPath(g, 5);

    }
}
