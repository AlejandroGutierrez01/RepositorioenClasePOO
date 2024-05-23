public class Estudiantes {
    
    String cedula;
    String nombre;
    String apellido;
    String ciudad;
    int edad;


    public Estudiantes() {
    }

    public Estudiantes(String cedula, String nombre, String apellido, String ciudad, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //método personalizado
    public Double notaMinima() {
        return  0.0;
    };
    public Double notaMaxima() {
        return  0.0;
    };
    public  void  imprimirCalificaciones(){
        System.out.println("Cedula: " + this.getCedula());
    }
}
