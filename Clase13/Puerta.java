package Clase13;
public class Puerta {
    private EstadoPuerta estado;
    private boolean modoEmergencia;

    public Puerta() {

        estado = EstadoPuerta.Cerrada;
        modoEmergencia = false;
    }

    public EstadoPuerta getEstado() {
        return estado;
    }

    public void setEstado(EstadoPuerta estado) {
        this.estado = estado;
    }

    public boolean isModoEmergencia() {
        return modoEmergencia;
    }

    public void setModoEmergencia(boolean modoEmergencia) {
        this.modoEmergencia = modoEmergencia;
    }

    public void abrir() {

        estado = EstadoPuerta.Abierta;

        System.out.println("Puerta abierta");
    }

    public void cerrar() {

        estado = EstadoPuerta.Cerrada;

        System.out.println("Puerta cerrada");
    }

    public void activarEmergencia() {

        modoEmergencia = true;

        abrir();

        System.out.println("Modo emergencia activado");
    }
}
