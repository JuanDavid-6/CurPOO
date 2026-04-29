package Clase11;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(5, 3);
        System.out.println("Mesa: " + cliente.getMesa());
        System.out.println("Comensales: " + cliente.getComensales());

        Orden orden = new Orden("1:00 pm", "Carlos");
        System.out.println("\nMesero: Carlos");
        System.out.println("Hora: 1:00 pm");

        Bebida b1 = new Bebida(2, "Gaseosa");
        Bebida b2 = new Bebida(1, "Jugo");

        orden.agregarBebida(b1);
        orden.agregarBebida(b2);

        Platillo p1 = new Platillo(1, "Hamburguesa");
        Platillo p2 = new Platillo(2, "Pizza");

        orden.agregarPlatillo(p1);
        orden.agregarPlatillo(p2);

        System.out.println("\n--- PEDIDO ---");

        System.out.println("Bebidas:");
        System.out.println("- " + b1.getTipo() + " x" + b1.getCantidad());
        System.out.println("- " + b2.getTipo() + " x" + b2.getCantidad());

        System.out.println("\nPlatillos:");
        System.out.println("- " + p1.getTipo() + " x" + p1.getCantidad());
        System.out.println("- " + p2.getTipo() + " x" + p2.getCantidad());

        double subTotal = 50000;
        double propina = 5000;
        double impuestos = 4000;

        Efectivo pago = new Efectivo(subTotal, propina, impuestos, 70000);

        double total = pago.calculoTotal(subTotal, propina, impuestos);

        System.out.println("\n--- FACTURA ---");
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Propina: " + propina);
        System.out.println("Impuestos: " + impuestos);
        System.out.println("Total a pagar: " + total);

        pago.pagar();
    }
}
