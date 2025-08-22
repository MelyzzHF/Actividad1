/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 21/08/2025 
 * * Descripción: La clase LinkedList sirve para hacer las listas simples y saber si esta vacía
 * **/

package Actividad1.scr;

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public void simpleInsertFila(T data) {
        Node<T> nuevo = new Node<>(data);
        if (head == null) {
            head = nuevo;
        } else {
            Node<T> actual = head;
            while (actual.getNext() != null) {
                actual = actual.getNext();
            }
            actual.setNext(nuevo);
            nuevo.setPrev(actual);
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}