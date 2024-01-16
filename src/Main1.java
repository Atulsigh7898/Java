import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Graph class
class Graph {
    // Adjacency list to represent the graph
    private Map<Integer, List<Integer>> adjacencyList;

    // Constructor
    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // Add a vertex to the graph
    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new LinkedList<>());
    }

    // Add an edge to the graph
    public void addEdge(int source, int destination) {
        // Add edge from source to destination
        adjacencyList.get(source).add(destination);

        // For an undirected graph, add the reverse edge as well
        adjacencyList.get(destination).add(source);
    }

    // Print the graph
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            System.out.print("Vertex " + entry.getKey() + " is connected to: ");
            List<Integer> neighbors = entry.getValue();
            for (Integer neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

// Main class
public class Main1 {
    public static void main(String[] args) {
        // Create a graph
        Graph graph = new Graph();

        // Add vertices
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        // Add edges
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);

        // Print the graph
        graph.printGraph();
    }
}
