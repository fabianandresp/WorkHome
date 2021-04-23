public class Registro {

    private int numeroRegistro = 1;
    Persona usuario = new Persona();
    public Registro() {

    }

    public void llenarRegistro(String nombre, int edad, String correo, String cargo) {

    usuario.setNombre(nombre);
    usuario.setEdad(edad);
    usuario.setCorreo(correo);
    usuario.setCargo(cargo);
    }

    public void imprimirRegistro(){
        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());
        System.out.println(usuario.getCorreo());
        System.out.println(usuario.getCargo());
    }
}
