package Clase11;

public class Orden {
    
    private String hora;
    private String mesero;

    private Bebida[] bebidas;
    private Platillo[] platillos;

    private int contadorBebidas;
    private int contadorPlatillos;

    public Orden(String hora, String mesero) {
        this.hora = hora;
        this.mesero = mesero;

        bebidas = new Bebida[10];   // máximo 10 bebidas
        platillos = new Platillo[10]; // máximo 10 platillos

        contadorBebidas = 0;
        contadorPlatillos = 0;
    }

    public void agregarBebida(Bebida b) {
        if (contadorBebidas < bebidas.length) {
            bebidas[contadorBebidas] = b;
            contadorBebidas++;
        } else {
            System.out.println("No se pueden agregar más bebidas");
        }
    }

    public void agregarPlatillo(Platillo p) {
        if (contadorPlatillos < platillos.length) {
            platillos[contadorPlatillos] = p;
            contadorPlatillos++;
        } else {
            System.out.println("No se pueden agregar más platillos");
        }
    }

    public int getContadorBebidas() {
        return contadorBebidas;
    }

    public int getContadorPlatillos() {
        return contadorPlatillos;
    }
}
