public class Cuadrilateros extends FigurasGeometricas {
    double ancho;
    double largo;
    public Cuadrilateros(){}
    public Cuadrilateros(double ancho, double largo){
        this.ancho = ancho;
        this.largo = largo;
    }
    public double getAncho(){
        return ancho;
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    public double getLargo(){
        return largo;
    }
    public void setLargo(double largo){
        this.largo = largo;
    }
    public double calcularArea(){
        return largo * ancho;
    }
    public double calcularPerimetro(){
        return largo * 2 + ancho * 2;
    }
}
