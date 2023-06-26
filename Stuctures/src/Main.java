import Utils.*;
import input.InputReader;

public class Main {
    private final static UtilsStack utilsStack = new UtilsStack();
    private final static UtilsQueue utilsQueue = new UtilsQueue();
    private final static UtilsCirculeLinkedList utilsCirculeLinkedList = new UtilsCirculeLinkedList();
    private final static UtilsBinaryTree utilsBinaryTree = new UtilsBinaryTree();
    private final static UtilsGraph utilsGraph = new UtilsGraph();
    private final static InputReader inputReader = new InputReader();
    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        while (true){
            System.out.println("\n 1 - Pilha ");
            System.out.println(" 2 - Fila");
            System.out.println(" 3 - Lista Circular");
            System.out.println(" 4 - Árvore Binária");
            System.out.println(" 5 - Grafos");
            System.out.println(" 6 - Sair");

            switch (inputReader.readInt("Opção: ")){
                case 1 -> Stack();
                case 2 -> Queue();
                case 3 -> CirculeLinkedList();
                case 4 -> BinaryTree();
                case 5 -> Graph();
                case 6 -> {
                    return;
                }
                default -> System.out.println("Opção inválida! ");
            }
        }

    }

    private static void Stack(){
        while (true){
            System.out.println(" 1 - Inserir capacidade da pilha");
            System.out.println(" 2 - Inserir valor na pilha");
            System.out.println(" 3 - Acessar Top");
            System.out.println(" 4 - Visualizar valores");
            System.out.println(" 5 - Visualizar tamanho da pilha");
            System.out.println(" 6 - Esta vazia?");
            System.out.println(" 7 - Sair");
            switch (inputReader.readInt("Opção: ")){
                case 1 -> utilsStack.create();
                case 2 -> utilsStack.push();
                case 3 -> utilsStack.peak();
                case 4 -> utilsStack.print();
                case 5 -> utilsStack.size();
                case 6 -> utilsStack.isEmpty();
                case 7 -> {
                    return;
                }
                default -> System.out.println("Opção inválida! ");
            }
        }
    }
    public static void Queue(){
        while (true){
            System.out.println(" 1 - Inserir valor na fila");
            System.out.println(" 2 - Eliminar primeiro elemento");
            System.out.println(" 3 - Acessar primeiro valor");
            System.out.println(" 4 - Esta vazia?");
            System.out.println(" 5 - Tamanho da fila");
            switch (inputReader.readInt("Opção: ")){
                case 1 -> utilsQueue.enqueue();
                case 2 -> utilsQueue.dequeue();
                case 3 -> utilsQueue.peak();
                case 4 -> utilsQueue.isEmpty();
                case 5 -> utilsQueue.size();
                case 6 -> {
                    return;
                }
                default -> System.out.println("Opção inválida! ");
            }
        }
    }
    public static void CirculeLinkedList(){
        while (true){
            System.out.println(" 1 - Inserir valor");
            System.out.println(" 2 - Remover");
            System.out.println(" 3 - Visualizar");
            switch (inputReader.readInt("Opção: ")){
                case 1 -> utilsCirculeLinkedList.add();
                case 2 -> utilsCirculeLinkedList.remove();
                case 3 -> utilsCirculeLinkedList.print();
                case 4 -> {
                    return;
                }
                default -> System.out.println("Opção inválida! ");
            }
        }
    }
    public static void BinaryTree(){
        while (true){
            System.out.println(" 1 - Inserir valor");
            System.out.println(" 2 - Buscar");
            System.out.println(" 3 - Visualizar");
            switch (inputReader.readInt("Opção: ")){
                case 1 -> utilsBinaryTree.insert();
                case 2 -> utilsBinaryTree.search();
                case 3 -> utilsBinaryTree.display();
                case 4 -> {
                    return;
                }
                default -> System.out.println("Opção inválida! ");
            }
        }
    }
    public static void Graph(){
        while (true){
            System.out.println(" 1 - Inserir vértice");
            System.out.println(" 2 - Inserir aresta");
            System.out.println(" 3 - Obter adjacentes ");
            System.out.println(" 4 - Visualizar");
            System.out.println(" 5 - Sair");
            switch (inputReader.readInt("Opção: ")){
                case 1 -> utilsGraph.addVertex();
                case 2 -> utilsGraph.addEdge();
                case 3 -> utilsGraph.getAdjacentVertices();
                case 4 -> utilsGraph.visualize();
                case 5 -> {
                    return;
                }
            }
        }
    }

}