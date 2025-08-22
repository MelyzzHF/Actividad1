/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 21/08/2025 
 * * Descripción: La clase Stack sirve para simular una pila, contiene los metodos como push, pop, peek
 * **/
package Actividad1.scr;

public class Stack<T> {
    private Node<T> head;

    public Stack() {
        this.head = null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(head);
        if (head != null)
            head.setPrev(newNode);
        head = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        T data = head.getData();
        head = head.getNext();
        if (head != null)
            head.setPrev(null);
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        return head.getData();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void mostrarPila() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return;
        }
        Node<T> actual = head;
        System.out.print(actual.getData());
        actual = actual.getNext();
        while (actual != null) {
            System.out.print(" -> " + actual.getData());
            actual = actual.getNext();
        }
        System.out.println();
    }
}