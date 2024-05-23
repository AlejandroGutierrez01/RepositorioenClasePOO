public class FigurasGeometricas {
    String nombre;
    int nlados;
    boolean regularidad;
    public FigurasGeometricas() {}
    public FigurasGeometricas(String nombre, int nlados, boolean regularidad) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isRegularidad() {
        return regularidad;
    }

    public void setRegularidad(boolean regularidad) {
        this.regularidad = regularidad;
    }

    public int getLados() {
        return nlados;
    }

    public void setLados(int nlados) {
        this.nlados = nlados;
    }
}
