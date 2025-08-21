/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 16/08/2025 
 * * Descripción: La clase Node sirve para guardar la información de los datos en un nodo, y estos se conectan entre si 
 *
 * **/

package Actividad1.scr;

public class Node<T> {
    public T data;
    public Node<T> next;
    public Node<T> prev;

    public Node() {
        this.data = null;
        this.next = null;
        this.prev = null;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node(T data, Node<T> next, Node<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
