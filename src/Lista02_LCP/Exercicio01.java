package Lista02_LCP;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        scan.close();

        String palavraFinal = "";
        String listaD = "da de do";

        palavra = palavra.toLowerCase();
        String[] listaPalavras = palavra.split(" ");

        for (String pal: listaPalavras) {
            String newPal = "";
            if (!listaD.contains(pal)) {
                newPal += Character.toUpperCase(pal.charAt(0));
            } else {
                newPal += pal.charAt( 0);
            }
            for (int i = 1; i < pal.length(); i++) {
                newPal += pal.charAt(i);
            }

            palavraFinal += newPal+" ";
        }        
        System.out.printf("%s", palavraFinal);
    }
}