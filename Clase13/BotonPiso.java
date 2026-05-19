package Clase13;

public class BotonPiso extends Boton{

    private int numeroPiso;
    private Direccion direccion;

    public BotonPiso(int numeroPiso, Direccion direccion) {

        this.numeroPiso = numeroPiso;
        this.direccion = direccion;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void presionar() {

        iluminar();

        emitirSonido();

        System.out.println("Ascensor solicitado desde el piso " + numeroPiso);
    }
}
