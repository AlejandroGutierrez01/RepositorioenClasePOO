//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FigurasGeometricas figura1 = new FigurasGeometricas();
        Circulos figura2 = new Circulos();
        Triangulos figura3 = new Triangulos();
        Cuadrilateros figura4 = new Cuadrilateros();

        Circulos figura5=new Circulos(3.0);
        Triangulos figura6=new Triangulos(4.0,8.0);
        Cuadrilateros figura7=new Cuadrilateros(4.0,4.0);
        Cuadrilateros figura8=new Cuadrilateros(5.0,9.0);

        //Circulo figura 2
        figura2.setNombre("Circulo");
        System.out.println(figura2.getNombre());
        figura2.setRadio(4.00);
        System.out.println("La nueva pileta tiene un radio de: " + figura2.getRadio());
        System.out.println("Su area es: " + figura2.calcularArea());
        System.out.println();
        //Triangulo figura 3
        figura3.setNombre("Triangulo");
        figura3.setAltura(10.0);
        System.out.println(figura3.getNombre());
        figura3.setBase(3.0);
        System.out.println("la altura del triangulo es: " + figura3.getAltura());
        System.out.println("la base del triangulo es: " + figura3.getBase());
        System.out.println("su area es: " + figura3.calcularArea());
        System.out.println("Su perimetro es: " + figura3.calcularPerimetro());
        System.out.println();

        //Cuadrilatero figura 4

        figura4.setNombre("Cuadrilatero");
        System.out.println(figura4.getNombre());
        figura4.setAncho(3.0);
        System.out.println("Tiene un ancho de: " + figura4.getAncho());
        figura4.setLargo(4.5);
        System.out.println("Tiene un largo de: " + figura4.getLargo());
        System.out.println("Tiene un area de: " + figura4.calcularArea());
        System.out.println("Tiene un perimetro de: " + figura4.calcularPerimetro());

    }
}