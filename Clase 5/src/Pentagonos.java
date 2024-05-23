//ME CAES MAL
public class Pentagonos extends FigurasGeometricas {
    double tamanioLados;
    double apotema;

    public Pentagonos() {
    }

    public Pentagonos(String nombre, int nlados, boolean regularidad, double tamanioLados, double apotema) {
        super(nombre, nlados, regularidad);
        this.tamanioLados = tamanioLados;
        this.apotema = apotema;
    }
    public double calcularArea(){
        return apotema * 5 * tamanioLados;
    }
    public double calcularPerimetro(){
        return tamanioLados * 5;
    }
}