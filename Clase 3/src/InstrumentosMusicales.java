public class InstrumentosMusicales {
    String categoria;
    String nombre;
    String materia;
    Double precio;
    Double tamanio;

    public InstrumentosMusicales() {
    }

    public InstrumentosMusicales(String categoria, String materia, String nombre, Double precio, Double tamanio) {
        this.categoria = categoria;
        this.materia = materia;
        this.nombre = nombre;
        this.precio = precio;
        this.tamanio = tamanio;
    }
    //métodos personalizados
    public void sonar(){
        //aqui la funcion que permite sonar el intrumento musical
        System.out.println("El sonido es...");
    }
    public Boolean entretener(){
        //funcion que me permite saber si entretiene o no
        return true;
    }
    //métodos setters y getters


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }
}
