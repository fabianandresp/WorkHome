import java.util.Scanner;

public class Polindromo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String frase;
        System.out.println("Digite una palabra o frase ");
        frase = s.nextLine();
        frase = frase.replaceAll(" ", "");
        int j = frase.length();

        System.out.println(" La frase o palabra que digito es: " + frase);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == frase.charAt(j - 1)) {
                //System.out.println(frase.charAt(i) + " = " + frase.charAt(j-1));
                j--;
                //System.out.println("La palabra o frase que se digito es  polindroma");
            } else {
                System.out.println("La palabra o frase digitda no es polindroma");
                System.out.println();
                System.out.println();

            }


        }


    }
}




