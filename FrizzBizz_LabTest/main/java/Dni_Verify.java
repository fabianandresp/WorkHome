import java.util.HashMap;

public class Dni_Verify {
    static HashMap<Integer, String> tabla = new HashMap<Integer, String>();

    static String verifyFinal = "valido";
    static int divisor = 23;
    static int dni_int;
    static int resultado;
    static String dni_comprobacion;

    static String verifyDni(String dni) {
        tabla.put(0, "T");
        tabla.put(1, "R");
        tabla.put(2, "W");
        tabla.put(3, "A");
        tabla.put(4, "G");
        tabla.put(5, "M");
        tabla.put(6, "Y");
        tabla.put(8, "P");
        tabla.put(9, "D");
        tabla.put(10, "X");
        tabla.put(11, "B");
        tabla.put(12, "N");
        tabla.put(13, "J");
        tabla.put(14, "Z");
        tabla.put(15, "S");
        tabla.put(16, "Q");
        tabla.put(17, "V");
        tabla.put(18, "H");
        tabla.put(19, "L");
        tabla.put(20, "C");
        tabla.put(21, "K");
        tabla.put(22, "E");

        //PRIMERA VERIFICACION
        //SE VERIFICA EL SIZE Y LOS CARACTERES DEL DNI INGRESADO
        if (dni.length() > 9 || dni.contains("u") || dni.contains("U") || dni.contains("I") || dni.contains("i") || dni.contains("o") || dni.contains("O") || dni.contains("Ñ") || dni.contains("ñ")) {
            System.out.println("DNI digitado incorrecto");
        } else {
            dni_comprobacion = dni;
            dni = dni.replaceFirst(".$", ""); //SE ELIMINA LA LETRA FINAL DEL DNI, YA SE ALMACENO EN OTRA VARIABLE (dni_comprobacion)

            //SEGUNDA VERIFICACION
            //SE REEMPLAZAN LAS LETRAS X,Y,Z POR SU VALOR NUMERICO, TAMBIEN SE CONTEMPLAN LAS MINUSCULAS

            if (dni.contains("x") || dni.contains("y") || dni.contains("z") || dni.contains("X") || dni.contains("Y") || dni.contains("Z")) {
                dni = dni.replaceAll("x", "0");
                dni = dni.replaceAll("y", "1");
                dni = dni.replaceAll("z", "2");
                dni = dni.replaceAll("X", "0");
                dni = dni.replaceAll("Y", "1");
                dni = dni.replaceAll("Z", "2");
            }

            //SE COMVIERTE EL STRING EN UN ENTERO, PARA SER UTILIZADO EN LA DIVISION
            dni_int = Integer.parseInt(dni);

            //OPERACION
            resultado = dni_int % divisor;

            //OBTENEMOS LA ULTIMA LETRA DEL DNI
            String ultimo = dni_comprobacion.substring(dni_comprobacion.length() - 1);

            //COMPROBACION FINAL
            // CON LAS VARIABLES RESULT Y ULTIMO SE BUSCAN LOS DATOS EN EL HASHMAP
            if (tabla.get(resultado).equals(ultimo.toUpperCase())) {
                System.out.println("Resultado: " + resultado + " Letra asiganada: " + ultimo.toUpperCase());
                System.out.println("DNI VALIDO!!");
                verifyFinal = "valido";

            } else {
                System.out.println("Resultado: " + resultado + " Letra asiganada: " + ultimo.toUpperCase());
                System.out.println("DNI NO VALIDO");
                verifyFinal = "No Valido";

            }


        }return verifyFinal;
    }
}

