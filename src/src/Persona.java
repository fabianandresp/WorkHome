public class Persona {
    String nombre;
    int edad;
    String correo;
    String cargo;

    public Persona(String nombre, int edad, String correo, String cargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.cargo = cargo;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
