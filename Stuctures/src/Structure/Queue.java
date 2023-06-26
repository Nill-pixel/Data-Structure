package Structure;


import Node.QueueNode;

public class Queue {
    private QueueNode first;
    private QueueNode last;
    private int size;

    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void enqueue(int value){
        QueueNode node =  new QueueNode(value);
        if(isEmpty()){
            first = node;
        }else {
            last.next = node;
        }
        last = node;
        size ++;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("A fila está vazia. Não é possível remover elementos.");
            return -1;
        }
        int valueRemoved = first.value;
        first = first.next;
        size--;

        if (isEmpty()) {
            last = null;
        }

        return valueRemoved;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("A fila está vazia. Não é possível acessar o elemento na frente.");
            return -1;
        }
        return first.value;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
}
