package Clase11;

public class Main {
    
public static void main(String[] args) {

        Orden orden = new Orden("12:00", "Pedro");

        orden.agregarBebida(new Bebida(2, "Gaseosa"));
        orden.agregarPlatillo(new Platillo(1, "Pizza"));

        double subTotal = 30000;
        double propina = 3000;
        double impuestos = 2400;

        Efectivo pago = new Efectivo(subTotal, propina, impuestos, 40000);

        double total = pago.calculoTotal(subTotal, propina, impuestos);

        System.out.println("Total: " + total);

        pago.pagar();
    }
}
