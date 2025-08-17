/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 16/08/2025 
 * * Descripción: La clase Node sirve para guardar la información de los datos en un nodo, y estos se conectan entre si 
 *
 * **/

package Actividad1;

public class Node<E> {
    public E DATA;
    public Node<E> NEXT;
    public Node<E> PREV;

    public Node() {
        this.DATA = null;
        this.NEXT = null;
        this.PREV = null;
    }

    public Node(E DATA) {
        this.DATA = DATA;
        this.NEXT = null;
        this.PREV = null;
    }

    public Node(E DATA, Node<E> NEXT, Node<E> PREV) {
        this.DATA = DATA;
        this.NEXT = NEXT;
        this.PREV = PREV;
    }

    @Override
    public String toString() {
        return DATA.toString();
    }

}
