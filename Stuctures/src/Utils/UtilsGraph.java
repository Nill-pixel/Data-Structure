package Utils;

import Interface.GraphMethod;
import Structure.Graph;
import input.InputReader;

public class UtilsGraph implements GraphMethod {
    Graph graph = new Graph();
    private final InputReader inputReader = new InputReader();
    @Override
    public void addVertex() {
        graph.addVertex(inputReader.readInt("Adicionar vértice: "));
    }

    @Override
    public void addEdge() {
        System.out.println("Adicionar aresta");
        graph.addEdge(inputReader.readInt("Raiz: "),inputReader.readInt("Destino: ") );
    }

    @Override
    public void visualize() {
        graph.visualize();
    }

    @Override
    public void getAdjacentVertices() {
        System.out.println(graph.getAdjacentVertices(inputReader.readInt("Obter adjacente do vértice: ")));
    }
}
