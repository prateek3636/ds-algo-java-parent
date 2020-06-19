package algoexpert.graph;

import algoexpert.graph.Graph;
import algoexpert.graph.Vertex;

import java.util.*;

/**
 * Date 08/20/2014
 * @author Tushar Roy
 *
 * Given a directed acyclic graph, do a topological sort on this graph.
 *
 * Do DFS by keeping visited. Put the vertex which are completely explored into a stack.
 * Pop from stack to get sorted order.
 *
 * Space and time complexity is O(n).
 */
public class TopologicalSort<T> {

    /**
     * Main method to be invoked to do topological sorting.
     */
    public Stack<Vertex<T>> topSort(Graph<T> graph) {

        Set<Vertex<T>> visited = new HashSet<>();
        Stack<Vertex<T>> stack = new Stack<>();

        for(Vertex<T> v : graph.getAllVertex()){
            if(visited.contains(v)){
                continue;
            }

            topSortUtil(v, stack, visited);
        }
        return stack;
    }

    private void topSortUtil(Vertex<T> vertex, Stack<Vertex<T>> stack,
                             Set<Vertex<T>> visited) {

        visited.add(vertex);

        for(Vertex<T> v : vertex.getAdjacentVertexes()){
            if(visited.contains(v)){
                continue;
            }
            topSortUtil(v, stack, visited);
        }
        stack.push(vertex);
    }

    public static void test(){
        Graph<Integer> graph = new Graph<>(true);
        graph.addEdge(1, 3);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);
        graph.addEdge(5, 6);
        graph.addEdge(6, 3);
        graph.addEdge(3, 8);
        graph.addEdge(8, 11);

        TopologicalSort<Integer> sort = new TopologicalSort<Integer>();
        Stack<Vertex<Integer>> result = sort.topSort(graph);
        while(!result.isEmpty()){
            System.out.println(result.pop());
        }
    }
}