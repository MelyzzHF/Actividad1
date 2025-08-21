/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 16/08/2025 
 * * Descripción: Main, clase principal en la que se realizan los menús y sirve para poder interactuar con el Usuario 
 * **/
package Actividad1.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Actividad1.scr.Queue;
import Actividad1.scr.Stack;

public class Main {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static Stack<String> Comando = new Stack<>();
    public static Queue<String> Proceso = new Queue<>();

    public static void main(String[] args) throws IOException {
        int opcion = -1;
        do {
            try {
                System.out.println("\n-------- Sistema Operativo --------");
                System.out.println("1. Agregar comando a la Pila ");
                System.out.println("2. Agregar proceso a la Fila ");
                System.out.println("3. Ejecutar Comandos");
                System.out.println("4. Realizar Procesos");
                System.out.println("5. Mostrar los comandos (Pila)");
                System.out.println("6. Mostrar los procesos (Fila)");
                System.out.println("0. Salir");
                System.out.print("Opción: ");

                opcion = Integer.parseInt(entrada.readLine());
                System.out.println("Elegiste: " + opcion);

                switch (opcion) {

                    case 1:
                        agregarComandos();
                        break;

                    case 2:
                        agregarProcesos();
                        break;

                    case 3:
                        ejecutarComando();
                        break;

                    case 4:
                        realizarProcesos();
                        break;
                        
                    case 5:
                        Comando.mostrarPila();
                        break;
                    case 6:
                        Proceso.mostrarFila();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida.");

                }

            } catch (NumberFormatException e) {
                System.out.println("Inválido, ingresa un número: ");
            }
        } while (opcion != 0);

    }

    public static void agregarComandos() throws IOException {
        boolean agregar = true;
        while (agregar) {
            System.out.print("Comando a apilar: ");
            String cmd = entrada.readLine();
            Comando.push(cmd);

            System.out.print("¿Quieres agregar otro comando? (si o no): ");
            String resp = entrada.readLine().toLowerCase();
            if (!resp.equals("si"))
                agregar = false;
        }
    }

    public static void agregarProcesos() throws IOException {
        boolean agregar = true;
        while (agregar) {
            System.out.print("Programa a enfilar: ");
            String prog = entrada.readLine();
            Proceso.enqueue(prog);

            System.out.print("¿Quieres agregar otro programa? (si o no): ");
            String resp = entrada.readLine().toLowerCase();
            if (!resp.equals("si"))
                agregar = false;
        }
    }

    public static void ejecutarComando() throws IOException {
        boolean continuar = true;
        while (continuar) {
            try {
                String tope = Comando.peek();
                if (tope == null) {
                    System.out.println("La pila está vacía.");
                    break;
                }
                System.out.println("Último comando: " + Comando.peek());
                Comando.pop();
                System.out.print("Pila actual: ");
                Comando.mostrarPila();
            } catch (Exception e) {
                System.out.println("La pila está vacía.");
                break;
            }

            System.out.print("¿Quieres ejecutar el siguiente comando? (si o no): ");
            String resp = entrada.readLine().toLowerCase();
            if (!resp.equals("si"))
                continuar = false;
        }
    }

    public static void realizarProcesos() throws IOException {
        boolean continuar = true;
        while (continuar) {
            try {
                String tope = Comando.peek();
                if (tope == null) {
                    System.out.println("La pila está vacía.");
                    break;}

                System.out.println("Primer proceso en la fila: " + Proceso.peek());
                Proceso.dequeue();
                System.out.print("Fila actual: ");
                Proceso.mostrarFila();
            } catch (Exception e) {
                System.out.println("La fila está vacía.");
                break;
            }

            System.out.print("¿Quieres procesar el siguiente proceso? (si o no): ");
            String resp = entrada.readLine().toLowerCase();
            if (!resp.equals("si"))
                continuar = false;
        }
    }

}
