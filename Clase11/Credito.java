package Clase11;

public class Credito extends Pago {
    
    private int numeroTdeCredito;
    private String tipo;
    private String fechaExp;
    private String nombre;

    public Credito(double subTotal, double propina, double impuestos,
                   int numeroTdeCredito, String tipo, String fechaExp, String nombre) {
        super(subTotal, propina, impuestos);
        this.numeroTdeCredito = numeroTdeCredito;
        this.tipo = tipo;
        this.fechaExp = fechaExp;
        this.nombre = nombre;
    }

    public boolean hacerCargo(double total) {
        System.out.println("Pago con tarjeta aprobado: " + total);
        return true;
    }
}
