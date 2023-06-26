package Structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private final Map<Integer, List<Integer>> adjacencies;

    public Graph() {
        adjacencies = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencies.put(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        if (!adjacencies.containsKey(source)) {
            addVertex(source);
        }
        if (!adjacencies.containsKey(destination)) {
            addVertex(destination);
        }

        adjacencies.get(source).add(destination);
    }

    public List<Integer> getAdjacentVertices(int vertex) {
        return adjacencies.getOrDefault(vertex, new ArrayList<>());
    }

    public void visualize() {
        for (int vertex : adjacencies.keySet()) {
            System.out.print(vertex + " -> ");
            List<Integer> adjacentVertices = adjacencies.get(vertex);
            for (int adjacentVertex : adjacentVertices) {
                System.out.print(adjacentVertex + " ");
            }
            System.out.println();
        }
    }
}

