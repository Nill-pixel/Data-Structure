package Structure;

public class Stack {
    private final int capacity;
    private final int[] elements;
    private int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.top = -1;
    }
    public void push(int element){
        if(top < capacity - 1){
            top++;
            elements[top] = element;
        }else{
            System.out.println("A pilha está cheia. Não é possível adicionar mais elementos.");
        }
    }
    public int pop(){
        if (top>0){
            int elementRemoved = elements[top];
            top--;
            return elementRemoved;
        }else {
            System.out.println("A pilha está vazia. Não é possível remover elementos.");
            return -1;
        }
    }
    public int peak(){
        if(top >= 0){
            return elements[top];
        }else{
            System.out.println("A pilha está vazia. Não é possível acessar o topo.");
            return -1;
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public int size(){
        return top + 1;
    }

    public void print(){
        System.out.println("\n");
        for (int element: elements){
            System.out.print(element + " ");
        }
    }
}
