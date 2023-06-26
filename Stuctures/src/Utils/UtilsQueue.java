package Utils;

import Interface.QueueMethod;
import Structure.Queue;
import input.InputReader;

public class UtilsQueue implements QueueMethod {
    private final InputReader inputReader = new InputReader();
    Queue queue;
    @Override
    public void enqueue() {
        queue = new Queue();
        queue.enqueue(inputReader.readInt("Inserir valor: "));
    }

    @Override
    public void dequeue() {
        queue.dequeue();
    }

    @Override
    public void peak() {
        queue.peek();
    }

    @Override
    public void isEmpty() {
        System.out.println(queue.isEmpty());
    }

    @Override
    public void size() {
        System.out.println(queue.size());
    }
}
