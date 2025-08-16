package Actividad1;

public class LinkedList<T> {
    public Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(T contacto) {
        this.head = new Node<T>(contacto);
    }

    public void simpleInsert(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> actual = head;
            while (actual.next != null)
                actual = actual.next;
            actual.next = newNode;
        }
    }

    public void doubleInsert(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> actual = head;
            while (actual.next != null)
                actual = actual.next;

            actual.next = newNode;
            newNode.prev = actual;
        }
    }

    public void circleInsert(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
        } else {
            Node<T> actual = head;
            while (actual.next != head) 
                actual = actual.next;

            actual.next = newNode;
            newNode.next = head;
        }
    }
}
