/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 21/08/2025 
 * * Descripción: La clase Node sirve para guardar la información de los datos en un nodo, y estos se conectan entre si 
 *
 * **/

package Actividad1.scr;

public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;
    
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    

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
