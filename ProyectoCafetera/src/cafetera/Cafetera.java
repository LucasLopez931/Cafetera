package cafetera;



public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    public Cafetera(int capacidad) {
        capacidadMaxima = capacidad;
        cantidadActual = capacidadMaxima;
    }

    public Cafetera(int capacidad, int cantidad) {
        this.capacidadMaxima = capacidad;
        this.cantidadActual = cantidad;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int c) {
        capacidadMaxima = c;
    }

    public void setCantidadActual(int c) {
        cantidadActual = c;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public int servirTaza(int cc) {
        int servido;

        if (cantidadActual == 0) {
            servido = 0;
            System.out.println("Lo siento, pero no queda nada de café.");
        } else {
            if (cantidadActual <= cc) {
                servido = cantidadActual;
                System.out.println("Se ha servido todo lo que quedaba (" +
                        cantidadActual + " c.c.)");
                cantidadActual = 0;
            } else {
                servido = cc;
                cantidadActual -= cc;
                System.out.println("Todavía quedan " + cantidadActual + " c.c.");
            }
        }
        return servido;
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    public void agregarCafe(int cc) {
        cantidadActual += cc;
    }

    public String toString() {
        return "Capacidad = " + capacidadMaxima +
               " Cantidad actual = " + cantidadActual;
    }
}


