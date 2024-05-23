public class Persona {
    //Atributos
    String nombre;
    int edad;
    String ojos;
    Double peso;
    String lugarnacimiento;
    Double altura;

    //Mtodo constructor -->permite inicializar los metodos de una clase
    public Persona() {}
    public Persona(String nombre, int edad , String ojos , Double peso, String lugarnacimiento) {} //inicializar

    //Metodos

        //setters ---> setea los datos

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setLugarnacimiento(String lugarnacimiento) {
        this.lugarnacimiento = lugarnacimiento;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    //getters --> toma los datos

    public Double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public String getLugarnacimiento() {
        return lugarnacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOjos() {
        return ojos;
    }

    public Double getAltura() {
        return altura;
    }

    //otros metodos

    public Double imc(){
        return altura/peso;
    }
    public void imprimirDatosPersona(){
        System.out.println(this.getNombre());
        System.out.println(this.getAltura());
        System.out.println(this.getPeso());
        System.out.println(this.getEdad());
    }


}
