import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InstrumentosMusicales guitarra=new InstrumentosMusicales(
                "Cuerdas","caoba","Guitarra",350.0,75.0);
        InstrumentosMusicales violin=new InstrumentosMusicales();
        Deportes futbol=new Deportes(
                "Futbol",22,true,true,90.0);
        Canciones cancion=new Canciones(
                "Porfiado", "Cuarteto de Nos","Santiago Tayalla",4.20,"Rock","Enamorado Tuyo");
        Automoviles automovil=new Automoviles(
                10000,5,"Rojo","Tesla","S Plaid");
        Videojuegos videojuego=new Videojuegos(
                "Hollow Knight","Metroidvania",10.0,"Team Cherry","Team Cherry",95);
        //guitarra.sonar();
        //guitarra.entretener();
        //violin.sonar();
        //violin.entretener();
        System.out.println(guitarra.getCategoria());
        System.out.println(guitarra.getNombre());
        System.out.println(violin.getCategoria());
        System.out.println(violin.getNombre());
        violin.setCategoria("Cuerda");
        violin.setNombre("Stradivarius");
        System.out.println("Categoria: " + violin.getCategoria());
        System.out.println("Nombre: " + violin.getNombre());
        Scanner sc=new Scanner(System.in);
    }
}