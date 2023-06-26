package Structure;

import Node.Node;

public class CirculeLinkedList {
    private Node head;
    private Node tail;
    public CirculeLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int value) {
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
            node.next = node;
            node.prev = node;
        } else {
            node.prev = this.tail;
            node.next = this.head;
            this.tail.next = node;
            this.head.prev = node;
            this.tail = node;
        }
    }

    public void remove(int value) {
        if (this.head == null) {
            return;
        }

        Node current = this.head;
        while (current.value != value && current.next != this.head) {
            current = current.next;
        }

        if (current == this.head && current == this.tail) {
            this.head = null;
            this.tail = null;
        } else if (current == this.head) {
            this.head = current.next;
            this.head.prev = this.tail;
            this.tail.next = this.head;
        } else if (current == this.tail) {
            this.tail = current.prev;
            this.tail.next = this.head;
            this.head.prev = this.tail;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void print() {
        if (this.head == null) {
            System.out.println("A lista circular está vazia.");
            return;
        }

        Node current = this.head;
        System.out.print("Valores: ");
        do {
            System.out.print(current.value+ " ");
            current = current.next;
        } while (current != this.head);
    }
}
