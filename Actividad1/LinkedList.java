/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 16/08/2025 
 * * Descripción: La clase LinkedList sirve para hacer las listas simples, doble y circular, y en las listas poner el objeto Contacto
 * y tiene metodos que son para insertar, eliminar, encontrar y mostrar. 
 * **/


package Actividad1;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {
    public Node<T> HEAD;
    public int LIST_TYPE;

    public LinkedList() {
        this.HEAD = null;
        this.LIST_TYPE = 1;
    }

    public LinkedList(int LIST_TYPE) {
        this.HEAD = null;
        this.LIST_TYPE = LIST_TYPE;
    }

    public LinkedList(T contacto) {
        this.HEAD = new Node<T>(contacto);
    }

    public void setListType(int LIST_TYPE)
    {
        this.LIST_TYPE = LIST_TYPE;
    }

    public void simpleInsert(T DATA) {
        Node<T> NEW_NODO = new Node<T>(DATA);
        if ( HEAD == null) {
            HEAD = NEW_NODO;
        } else {
            Node<T> ACTUAL_NODO = HEAD;
            while (ACTUAL_NODO.NEXT != null)
                ACTUAL_NODO = ACTUAL_NODO.NEXT;
            ACTUAL_NODO.NEXT = NEW_NODO;
        }
    }

    public void doubleInsert(T DATA) {
        Node<T> NEW_NODO = new Node<T>(DATA);
        if (HEAD == null) {
            HEAD = NEW_NODO;
        } else {
            Node<T> ACTUAL_NODO = HEAD;
            while (ACTUAL_NODO.NEXT != null)
                ACTUAL_NODO = ACTUAL_NODO.NEXT;

            ACTUAL_NODO.NEXT = NEW_NODO;
            NEW_NODO.PREV = ACTUAL_NODO;
        }
    }

    public void circleInsert(T DATA) {
        Node<T> NEW_NODO = new Node<T>(DATA);

        if (HEAD == null) {
            HEAD = NEW_NODO;
            NEW_NODO.NEXT = NEW_NODO;
        } else {
            Node<T> ACTUAL_NODO = HEAD;
            while (ACTUAL_NODO.NEXT != HEAD)
                ACTUAL_NODO = ACTUAL_NODO.NEXT;

            ACTUAL_NODO.NEXT = NEW_NODO;
            NEW_NODO.NEXT = HEAD;
        }
    }

    public void insert(T DATA) {
        switch (this.LIST_TYPE) {
            case 1:
                this.simpleInsert(DATA);
                break;
            case 2:
                this.doubleInsert(DATA);
                break;
            case 3:
                this.circleInsert(DATA);
                break;
        }
    }

    public boolean isEmpty() {
        return (this.HEAD == null);

    }

    public void Delete(String value, int tipoLista) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("La lista está vacía");
        }

        Node<T> actual = HEAD;
        Node<T> NEXT_HEAD = null;
        Node<T> prevNode = null;
        boolean eliminado = false;

        Contacto contacto = null;

        switch (tipoLista) {
            case 1:

                while (actual != null) {

                    if (actual.DATA instanceof Contacto) {

                        contacto = (Contacto) actual.DATA;

                        if (contacto.equals(value)) {
                            if (actual == HEAD) {
                                HEAD = actual.NEXT;
                            } else {
                                prevNode.NEXT = actual.NEXT;
                            }
                            eliminado = true;
                        }

                        prevNode = actual;
                        actual = actual.NEXT;

                    }

                }
                break;

            case 2:

                while (actual != null) {

                    if (actual.DATA instanceof Contacto) {

                        contacto = (Contacto) actual.DATA;

                        if (contacto.equals(value)) {

                            if (prevNode != null) {
                                prevNode.NEXT = actual.NEXT;
                            } else {
                                HEAD = actual.NEXT; // Es el HEAD
                            }

                            // Conectar el siguiente con el previo (solo si existe)
                            if (actual.NEXT != null) {
                                actual.NEXT.PREV = prevNode;
                            }

                            eliminado = true;
                            break;
                        }
                    }

                    prevNode = actual;
                    actual = actual.NEXT;
                }
                break;

            case 3: 
                do {
                    if (actual.DATA instanceof Contacto) {
                        contacto = (Contacto) actual.DATA;
                        if (contacto.equals(value)) {

                            eliminado = true;

                            if (actual == HEAD) {
                                if (actual.NEXT == HEAD){
                                    HEAD = null;
                                    break;
                                }
                                else{
                                   NEXT_HEAD = actual.NEXT;
                                   while (actual.NEXT != HEAD)
                                   {
                                        actual = actual.NEXT;
                                   }
                                   actual.NEXT = NEXT_HEAD;
                                   HEAD = NEXT_HEAD;
                                }

                            } else {
                                prevNode.NEXT = actual.NEXT;
                            }              
                        }

                        prevNode = actual; // prev = cabeza
                        actual = actual.NEXT; // actual = melissa
                    }

                } while (actual != HEAD);

                break;
        }

        if (!eliminado) {
            throw new Exception("No se encontró un contacto con ese nombre.");
        }
    }

    public Node<T> Find(String nombre) throws Exception {
        Node<T> ACTUAL_NODO = HEAD;

        if (ACTUAL_NODO != null) {
        do {
            if (ACTUAL_NODO.DATA instanceof Contacto) {
                Contacto contacto = (Contacto) ACTUAL_NODO.DATA;
                if (contacto.equals(nombre)) {
                    return ACTUAL_NODO;
                }
            }
            ACTUAL_NODO = ACTUAL_NODO.NEXT;
        } while (ACTUAL_NODO != null && ACTUAL_NODO != HEAD);
        }
        else {
            throw new Exception("No existen contactos en la lista. Favor de insertar contactos.");
        }
        return null;
    }

    public void Show() throws Exception {
        Node<T> ACTUAL_NODO = this.HEAD;
        List<String> simbolos = new ArrayList<>();
        simbolos.add(" --> ");
        simbolos.add(" <--> ");
        simbolos.add(" --> ");
        
        if (ACTUAL_NODO != null) {
            do {

                System.out.print(ACTUAL_NODO.DATA + " ");

                if (ACTUAL_NODO.NEXT != null)
                {
                    System.out.print(simbolos.get(this.LIST_TYPE-1));
                    if (ACTUAL_NODO.NEXT == HEAD)
                    {
                       System.out.print("... (se repite) ..." + simbolos.get(this.LIST_TYPE-1) + HEAD.DATA + simbolos.get(this.LIST_TYPE-1) + "...");     
                    }
                }
                
                ACTUAL_NODO = ACTUAL_NODO.NEXT;

            } while (ACTUAL_NODO != null && ACTUAL_NODO != HEAD);

        }
        else {
            throw new Exception("No existen contactos en la lista. Favor de insertar contactos.");
        }

    }

}
