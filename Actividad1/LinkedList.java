/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 16/08/2025 
 * * Descripción: La clase LinkedList sirve para hacer las listas simples, doble y circular, y en las listas poner el objeto Contacto
 * y tiene metodos que son para insertar, eliminar, encontrar y mostrar. 
 * **/


package Actividad1;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {
    public Node<T> head;
    public int LIST_TYPE;

    public LinkedList() {
        this.head = null;
        this.LIST_TYPE = 1;
    }

    public LinkedList(int LIST_TYPE) {
        this.head = null;
        this.LIST_TYPE = LIST_TYPE;
    }
    
    public void setListType(int LIST_TYPE)
    {
        this.LIST_TYPE = LIST_TYPE;
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

    public void doubleInsert(T data) {
        Node<T> newNodo = new Node<T>(data);
        if (head == null) {
            head = newNodo;
        } else {
            Node<T> actualNodo = head;
            while (actualNodo.next != null)
                actualNodo = actualNodo.next;

            actualNodo.next = newNodo;
            newNodo.prev = actualNodo;
        }
    }

    public void circleInsert(T data) {
        Node<T> newNodo = new Node<T>(data);

        if (head == null) {
            head = newNodo;
            newNodo.next = newNodo;
        } else {
            Node<T> actualNodo = head;
            while (actualNodo.next != head)
                actualNodo = actualNodo.next;

            actualNodo.next = newNodo;
            newNodo.next = head;
        }
    }

    public void insert(T data) {
        switch (this.LIST_TYPE) {
            case 1:
                this.simpleInsert(data);
                break;
            case 2:
                this.doubleInsert(data);
                break;
            case 3:
                this.circleInsert(data);
                break;
        }
    }

    public boolean isEmpty() {
        return (this.head == null);

    }



    public void Show() throws Exception {
        Node<T> actualNodo = this.head;
        List<String> simbolos = new ArrayList<>();
        simbolos.add(" --> ");
        simbolos.add(" <--> ");
        simbolos.add(" --> ");
        
        if (actualNodo != null) {
            do {

                System.out.print(actualNodo.data + " ");

                if (actualNodo.next != null)
                {
                    System.out.print(simbolos.get(this.LIST_TYPE-1));
                    if (actualNodo.next == head)
                    {
                       System.out.print("... (se repite) ..." + simbolos.get(this.LIST_TYPE-1) + head.data + simbolos.get(this.LIST_TYPE-1) + "...");     
                    }
                }
                
                actualNodo = actualNodo.next;

            } while (actualNodo != null && actualNodo != head);

        }
        else {
            throw new Exception("XXXXXXXXXXXXX");
        }

    }

}
