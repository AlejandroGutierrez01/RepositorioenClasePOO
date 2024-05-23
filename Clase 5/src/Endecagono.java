public class Endecagono extends FigurasGeometricas{
    double tamanioLados;
    double apotema;
    public Endecagono(){}
    public Endecagono(double tamanioLados, double apotema){
        this.apotema = apotema;
        this.tamanioLados = tamanioLados;
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
        return apotema * tamanioLados * 11;
    }
    public double calcularPerimetro(){
        return tamanioLados * 11;
    }
}