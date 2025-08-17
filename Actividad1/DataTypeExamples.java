/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 16/08/2025 
 * * Descripción: Esta clase sirve para mostrarle al usuario los ejemplos de las listas
 * simples, dobles y circulares 
 * **/
package Actividad1;

public class DataTypeExamples {
     public static void primitivoEjemplo(LinkedList<Integer> LIST) {
        LIST.setListType(1);
        LIST.insert(10);
        LIST.insert(20);
        LIST.insert(30);
        System.out.println("Ejemplo con enteros:");
        try {
            LIST.Show();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void stringEjemplo(LinkedList<String> LIST) {
        LIST.setListType(2);
        LIST.insert("Melissa");
        LIST.insert("Ximena");
        LIST.insert("Adrián");
        System.out.println("Ejemplo con cadenas:");
        try {
            LIST.Show();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contactoEjemplo(LinkedList<Contacto> LIST) {
        LIST.setListType(3);
        LIST.insert(new Contacto("Ana", 827845962, "Calle 123"));
        LIST.insert(new Contacto("Luis",815968745,  "Av. Reforma"));
        LIST.insert(new Contacto("Maria", 818965472, "Calle Luna"));
        System.out.println("Ejemplo con contactos:");
        try {
            LIST.Show();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

