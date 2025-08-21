/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 16/08/2025 
 * * Descripción: La clase LinkedList sirve para hacer las listas simples, doble y circular, y en las listas poner el objeto Contacto
 * y tiene metodos que son para insertar, eliminar, encontrar y mostrar. 
 * **/


package Actividad1.scr;

public class LinkedList<T> {
    public Node<T> head;
    public int LIST_TYPE;

    public LinkedList() {
        this.head = null;
    }
    
    public void simpleInsert(T data) {
        Node<T> newNodo = new Node<T>(data);
        if ( head == null) {
            head = newNodo;
        } else {
            Node<T> actualNodo = head;
            while (actualNodo.next != null)
                actualNodo = actualNodo.next;
            actualNodo.next = newNodo;
        }
    }


    public boolean isEmpty() {
        return (this.head == null);

    }



}
