package Clase13;

public class Ascensor {

    private int pisoActual;
    private Direccion direccion;
    private EstadoAscensor estado;
    private boolean estaAtascado;
    private Puerta puerta;
    private Boton boton;
    private int[] solicitudes;
    private int cantidadSolicitudes;

    public Ascensor() {
        pisoActual = 1;
        direccion = Direccion.Subir;
        estado = EstadoAscensor.Detenido;
        estaAtascado = false;
        puerta = new PuertaAscensor();
        boton = new BotonAscensor(1);
        solicitudes = new int[10];
        cantidadSolicitudes = 0;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public EstadoAscensor getEstado() {
        return estado;
    }

    public void setEstado(EstadoAscensor estado) {
        this.estado = estado;
    }

    public boolean isEstaAtascado() {
        return estaAtascado;
    }

    public void setEstaAtascado(boolean estaAtascado) {
        this.estaAtascado = estaAtascado;
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

    public int[] getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(int[] solicitudes) {
        this.solicitudes = solicitudes;
    }

    public int getCantidadSolicitudes() {
        return cantidadSolicitudes;
    }

    public void setCantidadSolicitudes(int cantidadSolicitudes) {
        this.cantidadSolicitudes = cantidadSolicitudes;
    }

    public void mover() {
        estado = EstadoAscensor.EnMovimiento;
        System.out.println("El ascensor se encuentra en movimiento");
    }

    public void detener() {
        estado = EstadoAscensor.Detenido;
        System.out.println("Ascensor detenido");
    }

    public void agregarSolicitud(int piso) {
        if (cantidadSolicitudes < solicitudes.length) {
            solicitudes[cantidadSolicitudes] = piso;
            cantidadSolicitudes++;
            System.out.println("Solicitud agregada para el piso " + piso);
        } else {
            System.out.println("No se pueden agregar mas solicitudes");
        }
    }

    public void atenderSolicitudes() {
        if (this.estaAtascado) {
            System.out.println("El ascensor esta atascado, no puede moverse.");
            return;
        }

        for (int i = 0; i < cantidadSolicitudes; i++) {
            int pisoDestino = solicitudes[i];

            if (pisoDestino == pisoActual) {
                System.out.println("El ascensor ya esta en el piso " + pisoDestino);
                cicloDePuertas();
                continue;
            }

            if (puerta.getEstado() == EstadoPuerta.Abierta) {
                System.out.println("Puerta cerrandose...");
                puerta.cerrar();
            }

            mover();

            if (pisoDestino > pisoActual) {
                direccion = Direccion.Subir;
                System.out.println("El ascensor se encuentra en movimiento para el piso " + pisoDestino
                        + " (Subiendo desde el piso " + pisoActual + ")");
            } else {
                direccion = Direccion.Bajar;
                System.out.println("El ascensor se encuentra en movimiento para el piso " + pisoDestino
                        + " (Bajando desde el piso " + pisoActual + ")");
            }

            while (pisoActual != pisoDestino) {
                try {
                    Thread.sleep(1300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                if (direccion == Direccion.Subir) {
                    pisoActual++;
                } else {
                    pisoActual--;
                }
                System.out.println("... Ascensor pasando por el piso " + pisoActual);
            }

            detener();
            System.out.println("Ascensor llego al piso " + pisoActual);
            cicloDePuertas();
        }

        cantidadSolicitudes = 0;
    }

    private void cicloDePuertas() {
        System.out.println("Sonido: Ding-Dong");
        puerta.abrir();
        System.out.println("Esperando pasajeros");
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
        }
        System.out.println("Puerta cerrandose");
        puerta.cerrar();
    }

    public void activarEmergencia() {
        estado = EstadoAscensor.Emergencia;
        System.out.println("Sonido: BEEP-BEEP-BEEP");
        puerta.activarEmergencia();
        System.out.println("Emergencia activada");
    }
}