package Clase13;

public class Piso {

    private int numeroPiso;

    private Puerta puerta;

    private Boton boton;

    public Piso(int numeroPiso) {

        this.numeroPiso = numeroPiso;

        puerta = new PuertaPiso(numeroPiso);

        boton = new BotonPiso(numeroPiso, Direccion.Subir);
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Boton getBoton() {
        return boton;
    }

    public void setBoton(Boton boton) {
        this.boton = boton;
    }

    public void solicitarAscensor() {

        boton.presionar();

        System.out.println("Esperando ascensor en el piso " + numeroPiso);
    }

    public void abrirPuerta() {

        puerta.abrir();
    }
}
