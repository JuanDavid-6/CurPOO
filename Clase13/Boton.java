package Clase13;

public class Boton {
    protected boolean estaIluminado;
    protected boolean estaFallando;

    public Boton() {

        estaIluminado = false;
        estaFallando = false;
    }

    public boolean isEstaIluminado() {
        return estaIluminado;
    }

    public void setEstaIluminado(boolean estaIluminado) {
        this.estaIluminado = estaIluminado;
    }

    public boolean isEstaFallando() {
        return estaFallando;
    }

    public void setEstaFallando(boolean estaFallando) {
        this.estaFallando = estaFallando;
    }

    public void presionar() {

        System.out.println("Boton presionado");
    }

    public void iluminar() {

        estaIluminado = true;

        System.out.println("Boton iluminado");
    }

    public void emitirSonido() {

        System.out.println("Beep");
    }

    public void detectarFalla() {

        if (estaFallando) {

            System.out.println("Falla detectada en el boton");
        }
    }

}
