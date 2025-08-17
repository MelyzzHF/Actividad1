/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 16/08/2025 
 * * Descripción: Main, clase principal en la que se realizan los menús y sirve para poder interactuar con el Usuario 
 * **/
package Actividad1.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Actividad1.Contacto;
import Actividad1.DataTypeExamples;
import Actividad1.LinkedList;
import Actividad1.Node;

public class Main {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static LinkedList<Contacto> LISTA = new LinkedList<Contacto>();
    public static int TIPO_LISTA = 0; // 1 = simple, 2 = doble, 3 = circular

    public static void main(String[] args) throws IOException {
        int OPCION = -1;
        do {
            try {
                System.out.println("\n-------- MENÚ PRINCIPAL --------");
                System.out.println("1. Crear Lista Simple");
                System.out.println("2. Crear Lista Doble");
                System.out.println("3. Crear Lista Circular");
                System.out.println("4. Ejemplo Lista Simple (Integer)");
                System.out.println("5. Ejemplo Lista Doble (String)");
                System.out.println("6. Ejemplo Lista Circular (Contacto)");
                System.out.println("0. Salir");
                System.out.print("Opción: ");

                OPCION = Integer.parseInt(entrada.readLine());
                System.out.println("Elegiste: " + OPCION);

                switch (OPCION) {

                    case 1:
                        TIPO_LISTA = 1;
                        LISTA.setListType(TIPO_LISTA);
                        subMenu();
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
                    case 4:
                        DataTypeExamples.primitivoEjemplo(new LinkedList<Integer>());
                        break;
                    case 5:
                        DataTypeExamples.stringEjemplo(new LinkedList<String>());
                        break;
                    case 6:
                        DataTypeExamples.contactoEjemplo(new LinkedList<Contacto>());
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

    public static void subMenu() throws IOException {
        int OP = -1;
        do {
            try {
                System.out.println("\n--- SUBMENÚ LISTA ---");
                System.out.println("1. Insertar contacto al inicio");
                System.out.println("2. Buscar contacto por nombre");
                System.out.println("3. Borrar contacto por nombre");
                System.out.println("4. Imprimir lista");
                System.out.println("5. Regresar al menú principal");
                System.out.print("Opción: ");
                OP = Integer.parseInt(entrada.readLine());

                switch (OP) {
                    case 1:
                        insertarFinal();
                        break;
                    case 2:
                        buscar();
                        break;
                    case 3:
                        borrar();
                        break;
                    case 4:
                        imprimir();
                        break;
                    case 5:
                        LISTA = new LinkedList<Contacto>();
                        break;
                    default:
                        System.out.println(" Opción inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, ingresa un número.");
            }
        } while (OP != 5);
    }

    public static void insertarFinal() throws IOException {
        System.out.print("Nombre y Apelido: ");
        String NOMBRE = entrada.readLine();
        System.out.print("Teléfono: ");
        int TELEFONO = Integer.parseInt(entrada.readLine());
        System.out.print("Dirección: ");
        String DIRECCION = entrada.readLine();

        Contacto c = new Contacto(NOMBRE, TELEFONO, DIRECCION);
        LISTA.insert(c);
    }

    public static void buscar() throws IOException {
        System.out.print(" Nombre y Apellido: ");
        String NOMBRE = entrada.readLine();
        try {
            Node<Contacto> encontrado = LISTA.Find(NOMBRE);
            if (encontrado != null)
                System.out.println(" Encontrado: " + encontrado.DATA);
            else
                System.out.println("No encontrado.");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void borrar() throws IOException {
        System.out.print("Nombre del contacto a eliminar: ");
        String DATA = entrada.readLine();

        try {
            LISTA.Delete(DATA, TIPO_LISTA);
            System.out.println(" Contacto eliminado.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
    
            
        }
    }

    public static void imprimir() {
        System.out.println("\n--- LISTA ---");
        try {
            LISTA.Show();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }

}
