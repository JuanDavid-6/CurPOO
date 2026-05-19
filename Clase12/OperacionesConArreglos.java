package Clase12;

public class OperacionesConArreglos {

    // Llenar un arreglo
    public int[] llenarArreglo(int[] a, int min, int max) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return a;
    }

    // Mostrar el arreglo
    public void mostrarArreglo(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i] + " ");
        }
    }

    // Metodo para sumar los numeros pares e impares del arreglo de enteros
    public String sumarParesImpares(int[] a) {
        int Pares = 0;
        int Impares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                Pares += a[i];
            } else {
                Impares += a[i];
            }
        }
        return "Suma de los pares es: " + Pares + ", Suma de los impares es: " + Impares;
    }
}
