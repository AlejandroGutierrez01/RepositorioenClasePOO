public class Canciones {
    String nombre;
    String compositor;
    String cantautor;
    double duracion;
    String genero;
    String album;

    public Canciones() {
    }

    public Canciones(String album, String cantautor, String compositor, double duracion, String genero, String nombre) {
        this.album = album;
        this.cantautor = cantautor;
        this.compositor = compositor;
        this.duracion = duracion;
        this.genero = genero;
        this.nombre = nombre;
    }
}
