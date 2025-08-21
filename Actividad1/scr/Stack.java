package Actividad1.scr;

public class Stack <T> {
    private Node <T> head;

    public Stack() {
        this.head = null;
    }

    public void push(T data){
         Node<T> newNodo = new Node<>(data);
         newNodo.next = head;
         if ( head != null) {
            head.prev = newNodo;
        }
        head = newNodo;
    }

    public T pop() {
        if (head == null) {
            System.out.println("La pila está vacía");
            return null;
        }
        T data = head.data;

        head = head.next;
        if (head != null){
            head.prev = null;
        }


        return data;
    }
    public T peek(){
        if (head == null)
        System.out.println("La pila esta vacía");
        return head.data;

    }

    public  void mostrarPila(){
        if (head == null) {
            System.out.println("La pila está vacía");
            return;
        }
        Node<T> actual = head;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("Vacío");
    }

    

    }
    




    
