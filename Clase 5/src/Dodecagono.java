public class Dodecagono extends FigurasGeometricas{
    double tamanioLados;
    double apotema;
    public Dodecagono(){
    }
    public Dodecagono(double tamanioLados,double apotema, int nlados){
        this.tamanioLados=tamanioLados;
        this.apotema=apotema;
    }

    public double getTamanioLados() {
        return tamanioLados;
    }

    public void setTamanioLados(double tamanioLados) {
        this.tamanioLados = tamanioLados;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    public double calcularArea(){
        return apotema * 12 * tamanioLados;
    }
    public double calcularPerimetro(){
        return tamanioLados * 12;
    }
}
