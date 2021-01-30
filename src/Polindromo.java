import java.util.Scanner;

public class Polindromo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String frase;
        int siPoli = 0;
        int noPoli = 0;
        while (true) {
            System.out.println("Digite una palabra o frase ");
            frase = s.nextLine();
            frase = frase.replaceAll(" ", "");
            int j = frase.length();

            System.out.println(" La frase o palabra que digito es: " + frase);

            for (int i = 0; i < frase.length(); i++) {
                j--;
                if (frase.charAt(i) == frase.charAt(j)) {
                    System.out.println(frase.charAt(i) + " -> " + frase.charAt(j) + " son iguales.");
                    siPoli++;
                } else {
                    System.out.println(frase.charAt(i) + " -> " + frase.charAt(j) + " son diferentes.");
                    noPoli++;
                }
            }
            if (siPoli == frase.length()) {
                System.out.println("Lo digitado es un Polidromo");
                break;
            } else if (noPoli != frase.length()) {
                System.out.println("Lo digitado no es un polindromo");
                break;
            }


        }
    }
}




