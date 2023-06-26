package Utils;

import Interface.CirculeLinkedListMethod;
import Structure.CirculeLinkedList;
import input.InputReader;

public class UtilsCirculeLinkedList implements CirculeLinkedListMethod {
    CirculeLinkedList circuleLinkedList;
    private final InputReader inputReader = new InputReader();
    @Override
    public void add() {
        circuleLinkedList = new CirculeLinkedList();
        circuleLinkedList.add(inputReader.readInt("Inserir valor: "));
    }

    @Override
    public void remove() {
        circuleLinkedList.remove(inputReader.readInt("Inserir valor que pretende remover: "));
    }

    @Override
    public void print() {
        circuleLinkedList.print();
    }
}
