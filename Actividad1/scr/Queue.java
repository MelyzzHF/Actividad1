package Actividad1.scr;

public class Queue<T> {
    private LinkedList<T> lista;

    public Queue() {
        lista = new LinkedList<>();

    }

    public void enqueue(T data) {
        lista.simpleInsert(data);
    }

      public T dequeue() {
        if (lista.head == null) {
            System.out.println("La fila está vacía");
            return null;
        }
        T data = lista.head.data;
        lista.head = lista.head.next;
        return data;}


    public T peek() {
        if (lista.head == null) {
            System.out.println("La fila está vacía");
            return null;
        }
        return lista.head.data;
    }

    public void mostrarFila() {
        if (lista.head == null) {
            System.out.println("La fila está vacía");
            return;
        }

        Node<T> actual = lista.head;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("Vacío");
    }

}
