package Clase11;

public class Pago {
    
    protected double subTotal;
    protected double propina;
    protected double impuestos;

    public Pago(double subTotal, double propina, double impuestos) {
        this.subTotal = subTotal;
        this.propina = propina;
        this.impuestos = impuestos;
    }

    public double calculoTotal(double subTotal, double propina, double impuestos) {
        return subTotal + propina + impuestos;
    }
}
