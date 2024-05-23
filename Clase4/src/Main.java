import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String var1;
        Estudiantes estudiante1 = new Estudiantes(
                "12345","","","",0);
        Estudiantes estudiante2 = new Estudiantes(
                "","","","",0);
        Estudiantes estudiante3 = new Estudiantes(
                "","","","",0);
        //uso de get
        System.out.println(estudiante1.getCedula());
        //
        //uso de setters
        estudiante2.setCedula("1234598435");
        System.out.println(estudiante2.getCedula());
    }
}