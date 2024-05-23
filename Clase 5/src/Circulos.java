public class Circulos extends FigurasGeometricas{
    double radio;
    public Circulos(){}
    public Circulos(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
    public double calcularPerimetro(){
        return Math.PI * 2 * radio;
    }
}
