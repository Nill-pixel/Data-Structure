package Node;

public class Node {
    public int value;
    public Node prev;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
