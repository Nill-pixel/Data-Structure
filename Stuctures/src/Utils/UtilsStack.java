package Utils;

import Interface.StackMethod;
import Structure.Stack;
import input.InputReader;

public class UtilsStack implements StackMethod {
    private final InputReader inputReader = new InputReader();
    Stack stack;
    @Override
    public void create() {
        stack = new Stack(inputReader.readInt("Inserir capacidade da pilha: "));
        System.out.print("    -> Capacidade inserida com sucesso! \n");
    }

    @Override
    public void push() {
        stack.push(inputReader.readInt("Adicionar elemento: "));
        System.out.print("    -> elemento inserido com sucesso! \n");
    }

    @Override
    public void pop() {
        stack.pop();
    }

    @Override
    public void peak() {
        System.out.println(stack.peak());
    }

    @Override
    public void isEmpty() {
        stack.isEmpty();
    }

    @Override
    public void size() {
        stack.size();
    }

    @Override
    public void print() {
        stack.print();
    }
}
