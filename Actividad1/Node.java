package Actividad1;

public class Node<E> {
    E data;
    Node<E> next;
    Node<E> prev;

    public Node(E data) {
        this.data = data;
    }

    public Node(E data, Node<E> next, Node<E> prev) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
