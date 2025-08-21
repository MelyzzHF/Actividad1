/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 16/08/2025 
 * * Descripción: Main, clase principal en la que se realizan los menús y sirve para poder interactuar con el Usuario 
 * **/
package Actividad1.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import Actividad1.LinkedList;
import Actividad1.Node;
import Actividad1.Queue;
import Actividad1.Stack;

public class Main {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static Stack<String> Comando = new Stack<>();
    public static Queue<String> Proceso = new Queue<>();


    public static void main(String[] args) throws IOException {
        int opcion = -1;
        do {
            try {
                System.out.println("\n-------- Sistema Operativo --------");
                System.out.println("1. Agregar comando a la Pila ");
                System.out.println("2. Agregar proceso a la Fila ");
                System.out.println("3. Realizar Procesos");
                System.out.println("4. Ejecutar Comandos");
                System.out.println("5. Mostrar la Pila");
                System.out.println("6. Mostrar la Fila");
                System.out.println("0. Salir");
                System.out.print("Opción: ");

                opcion = Integer.parseInt(entrada.readLine());
                System.out.println("Elegiste: " + opcion);

                switch (opcion) {

                    case 1:
                        System.out.println("¿Qué comando deseas agregar? ");
                        String com = entrada.readLine();
                        Comando.push(com);
                        



                        break;
                    case 2:
                        TIPO_LISTA = 2;
                        LISTA.setListType(TIPO_LISTA);
                        subMenu();
                        break;
                    case 3:
                        TIPO_LISTA = 3;
                        LISTA.setListType(TIPO_LISTA);
                        subMenu();
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
        } while (OPCION != 0);

    }

   

   
    public static void imprimir() {
        System.out.println("\n--- LISTA ---");
        try {
            .Show();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }



    public static void agregarMascomandos(){
        boolean masComandos = true;




    }

}
