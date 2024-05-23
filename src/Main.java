import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();

        persona1.setNombre("Pedro");
        persona1.setAltura(1.75);
        persona1.setPeso(50.0);
        persona1.setEdad(20);
        persona1.imprimirDatosPersona();

        System.out.print("Ingrese el nombre de la mascota: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la edad de la mascota: ");
        int edad = sc.nextInt();


        Mascota mascota1 = new Mascota();
        mascota1.setNombre(nombre);
        mascota1.setEdad(edad);
        mascota1.imprimirDatosMascota();

    }
}