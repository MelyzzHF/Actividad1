/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 21/08/2025 
 * * Descripción: Main, clase principal en la que se realizan los menús y sirve para poder interactuar con el Usuario 
 * manda a llamar los metodos de los comandos y procesos
 * Los comandos están en una pila mientras que los procesos en una fila
 * **/
package Actividad1.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Actividad1.scr.Queue;
import Actividad1.scr.Stack;

public class Main {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static Stack<String> Comandos = new Stack<>();
    public static Queue<String> Procesos = new Queue<>();

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
                        Comandos.mostrarPila();
                        break;
                    case 6:
                        Procesos.mostrarFila();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida.( Solo números entre el 0-6 )");

                }

            } catch (NumberFormatException e) {
                System.out.println("Inválido, ingresa un número ");
            }
        } while (opcion != 0);

    }

    public static void agregarComandos() throws IOException {
        boolean agregar = true;
        while (agregar) {
            String cmd = leerComandoNoNumerico("Comando a apilar: ");
            Comandos.push(cmd);

            agregar = preguntarSioNo("¿Quieres agregar otro comando? (si o no): ");
        }
    }


    public static void agregarProcesos() throws IOException {
        boolean agregar = true;
        while (agregar) {
            String prog = leerComandoNoNumerico("Programa a enfilar: ");
            Procesos.enqueue(prog);
            agregar = preguntarSioNo("¿Quieres agregar otro programa? (si o no): ");

        }
    }

    public static void ejecutarComando() throws IOException {
        boolean continuar = true;
        while (continuar) {

            String tope = Comandos.peek();
            if (tope == null) {
                System.out.println("La pila está vacía.");
                break;
            }
            System.out.println("Último comando: " + Comandos.peek());
            Comandos.pop();
            System.out.print("Pila actual: ");
            Comandos.mostrarPila();
            continuar = preguntarSioNo("¿Quieres ejecutar el siguiente comando? (si o no): ");
        }
    }

    public static void realizarProcesos() throws IOException {
        boolean continuar = true;
        while (continuar) {

            String tope = Procesos.peek();
            if (tope == null) {
                System.out.println("La fila está vacía.");
                break;
            }

            System.out.println("Primer proceso en la fila: " + Procesos.peek());
            Procesos.dequeue();
            System.out.print("Fila actual: ");
            Procesos.mostrarFila();
            continuar = preguntarSioNo("¿Quieres ejecutar el siguiente proceso? (si o no): ");

        }
    }

    // Para no repetir lo mismo en los cuatro métodos anteriores, mejor creamos un
    // método que nos sirva para lo mismo
    private static boolean preguntarSioNo(String prompt) throws IOException {
        while (true) {
            System.out.print(prompt);
            String respuesta = entrada.readLine();
            if (respuesta == null)
                continue;

            respuesta = respuesta.trim().toLowerCase();

            if (respuesta.equals("si") || respuesta.equals("sí"))
                return true;
            if (respuesta.equals("no"))
                return false;

            try {
                Integer.parseInt(respuesta);
                System.out.println("Por favor responda solo 'si' o 'no' (no números).");
            } catch (NumberFormatException e) {
                System.out.println("Respuesta inválida. Escriba 'si' o 'no'.");
            }
        }
    }
    // Para no repetir lo mismo en los dos primeros metodos anteriores, mejor creamos un
    // método que nos sirva para lo mismo (nM significa no numeros para que no se me olvide)

    private static String leerComandoNoNumerico(String prompt) throws IOException {
    while (true) {
        System.out.print(prompt);
        String nM = entrada.readLine();
        if (nM == null) continue;

        nM = nM.trim();
        if (nM.isEmpty()) {
            System.out.println("El comando no puede estar vacío.");
            continue;
        }
        try {
            Double.parseDouble(nM);
            System.out.println("El comando no puede ser un número. Escribe texto.");
            continue;
        } catch (NumberFormatException ok) {
        }

        return nM;
    }
}

}
