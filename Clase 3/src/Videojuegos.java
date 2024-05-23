public class Videojuegos {
    String nombre;
    String genero;
    Double precio;
    String publisher;
    String desarrollador;
    int puntaje;
    //constructor

    public Videojuegos() {
    }
    public Videojuegos(String nombre, String genero, Double precio, String publisher, String desarrollador, int puntaje) {
        this.nombre = nombre;
        this.genero = genero;
        this.precio = precio;
        this.publisher = publisher;
        this.desarrollador = desarrollador;
        this.puntaje = puntaje;
    }
}
