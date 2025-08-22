/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 21/08/2025 
 * * Descripción: La clase Queue sirve para simular ser una fila en la que contiene
 * los métodos enqueue (agregar un elemento al final), dequeue(eliminar un elemento del frente de esa misma cola)
 * peek y mostrar
 * **/
package Actividad1.scr;

public class Queue<T> {
    private final LinkedList<T> lista;

    public Queue() {
        this.lista = new LinkedList<>();
    }

    public void enqueue(T data) {
        lista.simpleInsertFila(data);
    }

    public T dequeue() {
        if (lista.isEmpty()) {
            System.out.println("La fila está vacía");
            return null;
        }
        Node<T> head = lista.getHead();
        T data = head.getData();

        Node<T> next = head.getNext();
        if (next != null)
            next.setPrev(null);
        lista.setHead(next); 

        return data;
    }

    public T peek() {
        if (lista.isEmpty()) {
            System.out.println("La fila está vacía");
            return null;
        }
        return lista.getHead().getData();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }
 // metodo para imprimirr 

    public void mostrarFila() {
        if (lista.isEmpty()) {
            System.out.println("La fila está vacía");
            return;
        }
        Node<T> actual = lista.getHead();
        System.out.print(actual.getData());
        actual = actual.getNext();

        while (actual != null) {
            System.out.print(" -> " + actual.getData());
            actual = actual.getNext();
        }
        System.out.println();
    }
}