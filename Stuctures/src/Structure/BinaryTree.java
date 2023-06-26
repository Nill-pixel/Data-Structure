package Structure;

import Node.NodeTree;

public class BinaryTree {
    private NodeTree source;

    public BinaryTree() {
        this.source = null;
    }
    public void insert(int value){
        source = insertRecursively(source, value);
    }
    private NodeTree insertRecursively(NodeTree actualNode, int value){
        if(actualNode == null){
            return new NodeTree(value);
        }
        if(value < actualNode.value){
            actualNode.left = insertRecursively(actualNode.left, value);
        } else if (value > actualNode.value) {
            actualNode.right = insertRecursively(actualNode.right, value);
        }
        return actualNode;
    }

    public boolean search(int value){
        return searchRecursively(source, value);
    }
    private boolean searchRecursively(NodeTree actualNode, int value){
        if (actualNode == null){
            return false;
        }
        if (value == actualNode.value){
            return true;
        }else if(value < actualNode.value){
            return searchRecursively(actualNode.left, value);
        }else {
            return searchRecursively(actualNode.right, value);
        }

    }
    public void display() {
        displayRecursively(source, "", true);
    }

    private void displayRecursively(NodeTree actualNode, String prefix, boolean isLast) {
        if (actualNode != null) {
            System.out.print(prefix);
            System.out.print(isLast ? "└── " : "├── ");
            System.out.println(actualNode.value);

            String newPrefix = prefix + (isLast ? "    " : "│   ");
            displayRecursively(actualNode.left, newPrefix, false);
            displayRecursively(actualNode.right, newPrefix, true);
        }
    }
}
