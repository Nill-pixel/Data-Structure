package Utils;

import Interface.BinaryTreeMethod;
import Structure.BinaryTree;
import input.InputReader;

public class UtilsBinaryTree implements BinaryTreeMethod {
    private final InputReader inputReader = new InputReader();
    BinaryTree binaryTree = new BinaryTree();
    @Override
    public void insert() {
        binaryTree.insert(inputReader.readInt("Inserir valor na árvore: "));
    }

    @Override
    public void search() {
        binaryTree.search(inputReader.readInt("Inserir valor que deseja buscar"));
    }

    @Override
    public void display() {
        binaryTree.display();
    }
}
