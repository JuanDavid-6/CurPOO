package Clase12;

import java.util.Arrays;

public class EjecutarArreglos {
    public static void main(String[] args) {
        // Cración del objeto "objArreglos" para poder acceder a los métodos de la clase
        OperacionesConArreglos objArreglos = new OperacionesConArreglos();

        // Creación del arreglo "a"
        int[] a = new int[5];

        // Insertando valores al arreglo "a"
        objArreglos.llenarArreglo(a, 0, 99);

        System.out.println(Arrays.toString(a));

        objArreglos.mostrarArreglo(a);

        System.out.println(objArreglos.sumarParesImpares(a));
    }

}