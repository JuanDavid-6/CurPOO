package Clase11;

public class Efectivo extends Pago {
    
    private double cantidad;

    public Efectivo(double subTotal, double propina, double impuestos, double cantidad) {
        super(subTotal, propina, impuestos);
        this.cantidad = cantidad;
    }

    public void pagar() {
        double total = calculoTotal(subTotal, propina, impuestos);
        double cambio = cantidad - total;

        if (cambio >= 0) {
            System.out.println("Pago exitoso. Cambio: " + cambio);
        } else {
            System.out.println("Falta dinero");
        }
    }
}
