import java.util.Scanner;

public class Controller {

    Registro reg1 = new Registro();
    Message mensajes = new Message();
    Scanner input = new Scanner(System.in);
    String name;
    int age;
    String email;
    String charge;
    int options;

    public Controller() {
    }

    public void inicio() {

        try {
            metodo();

        } catch (Exception e) {
            mensajes.issueMessage();
            input.nextLine();
            options = 0;
            metodo();
        }
    }

    public void metodo() {
        while (true) {
            mensajes.optionsMessage();
            options = input.nextInt();
            switch (options) {
                case 1:
                    //mensaje donde se solicita la informacion
                    System.out.println("enter your name");
                    name = input.next();

                    System.out.println("enter your age");
                    age = input.nextInt();

                    System.out.println(" enter your email");
                    email = input.next();

                    System.out.println("  enter your charge");
                    charge = input.next();

                    // se llama al metodo de registrar usuario
                    reg1.llenarRegistro(name, age, email, charge);

                    break;
                case 2:
                    // se llama al metodo de imprimir registro
                    reg1.imprimirRegistro();
                    break;

            }
        }
    }

}


