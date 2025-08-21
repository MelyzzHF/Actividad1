package Actividad1;

public class Queue<T>{
    private LinkedList<T> lista;

    public Queue(){
        lista = new LinkedList<>();

    }

    public void enqueue(T data){
        lista.simpleInsert(data);
        System.out.println("Programa encolado: " + data);

    }

    public T dequeue(){
        if(lista.head ==  null){
            System.out.println("La fila esta vacía");
        }
        T data = lista.head.data;
        lista.head = lista.head.next;
        return data;

    }

    public T peek(){
        if (lista.head == null )
        System.out.println("La fila esta vacía");
        return lista.head.data;
    }


    
}
