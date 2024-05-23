public class Mascota {
    String nombre;
    int edad;
    String raza;
    String especie;
    String color;

    public Mascota() {
    }

    public Mascota(String color, String raz, String especie, int edad, String nombre) {

        this.color = color;
        this.raza = raza;
        this.especie = especie;
        this.edad = edad;
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaz(String raz) {
        this.raza = raza;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaz() {
        return raza;
    }

    public String getEspecie() {
        return especie;
    }

    public String getColor() {
        return color;
    }

    //Metodos personalizados
    public void imprimirDatosMascota(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());

    }

}
