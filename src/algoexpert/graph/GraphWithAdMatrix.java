package algoexpert.graph;

// Adjacency Matrix representation in Java

public class GraphWithAdMatrix {
    private int[][] adjMatrix;
    private int numVertices;

    // Initialize the matrix
    public GraphWithAdMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    // Add edges
    public void addEdge(int i, int j, int weight) {
        adjMatrix[i][j] = weight;
        adjMatrix[j][i] = weight;
    }

    // Remove edges
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;
    }

    public int[][] getAdjMatrix(){
        return this.adjMatrix;
    }

//    // Print the matrix
//    public String  toString() {
//        String s = "";
//        for (int i = 0; i < adjMatrix.length; i++) {
//            for (int j = 0; j < adjMatrix[i].length; j++) {
//                s = '\n'+adjMatrix[i][j] + " ";
//            }
//            s = s+'\n';
//        }
//        return s;
//    }


}