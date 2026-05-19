package Clase13;

public class SistemaDeControl {
    
    private Ascensor ascensor;
    private Piso[] pisos;
    private SistemaAlertas alertas;

    public SistemaDeControl() {
        ascensor = new Ascensor();
        alertas = new SistemaAlertas();
        pisos = new Piso[4];

        for (int i = 0; i < pisos.length; i++) {
            pisos[i] = new Piso(i + 1);
        }
    }

    public Ascensor getAscensor() {
        return ascensor;
    }

    public void setAscensor(Ascensor ascensor) {
        this.ascensor = ascensor;
    }

    public Piso[] getPisos() {
        return pisos;
    }

    public void setPisos(Piso[] pisos) {
        this.pisos = pisos;
    }

    public SistemaAlertas getAlertas() {
        return alertas;
    }

    public void setAlertas(SistemaAlertas alertas) {
        this.alertas = alertas;
    }

    public void recibirSolicitud(int piso, Direccion direccion) {
        System.out.println("Sonido: *Beep* (Boton presionado)");
        System.out.println("Solicitud recibida desde el piso " + piso);
        ascensor.agregarSolicitud(piso);
    }

    public void optimizarRuta() {
        System.out.println("Buscando mejor ruta");
    }

    public void detectarFallas() {
        alertas.registrarFalla();
        alertas.enviarAlerta();
    }
}