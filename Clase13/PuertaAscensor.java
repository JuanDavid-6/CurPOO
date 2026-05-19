package Clase13;

public class PuertaAscensor extends Puerta {

    private boolean hayObstaculo;
    private int tiempoEspera;

    public PuertaAscensor() {

        hayObstaculo = false;
        tiempoEspera = 5;
    }

    public boolean isHayObstaculo() {
        return hayObstaculo;
    }

    public void setHayObstaculo(boolean hayObstaculo) {
        this.hayObstaculo = hayObstaculo;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public void mantenerAbierta() {

        System.out.println("Puerta mantenida abierta");
    }

    public boolean detectarObstaculo() {

        return hayObstaculo;
    }
}
