package Clase13;
public class BotonAscensor extends Boton {
    private int pisoSeleccionado;
    private boolean mantenerPuertaAbierta;

    public BotonAscensor(int pisoSeleccionado) {

        this.pisoSeleccionado = pisoSeleccionado;
        mantenerPuertaAbierta = false;
    }

    public int getPisoSeleccionado() {
        return pisoSeleccionado;
    }

    public void setPisoSeleccionado(int pisoSeleccionado) {
        this.pisoSeleccionado = pisoSeleccionado;
    }

    public boolean isMantenerPuertaAbierta() {
        return mantenerPuertaAbierta;
    }

    public void setMantenerPuertaAbierta(boolean mantenerPuertaAbierta) {
        this.mantenerPuertaAbierta = mantenerPuertaAbierta;
    }

    public void presionar() {

        iluminar();

        emitirSonido();

        System.out.println("Piso seleccionado: " + pisoSeleccionado);
    }

}
