public class Automoviles {
    String marca;
    String modelo;
    String color;
    int capacidad;
    int autonomia;

    public Automoviles() {
    }

    public Automoviles(int autonomia, int capacidad, String color, String marca, String modelo) {
        this.autonomia = autonomia;
        this.capacidad = capacidad;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }
}
