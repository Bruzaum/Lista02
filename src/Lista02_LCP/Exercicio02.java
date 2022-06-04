package Lista02_LCP;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra1 = scan.nextLine();
        String palavra2 = scan.nextLine();
        scan.close();

        StringBuilder palavraFinal = new StringBuilder();
        int tam;

        if (palavra1.length() > palavra2.length()) {
            tam = palavra1.length();
        } else tam = palavra2.length();
        
        for (int i = 0; i < tam; i++) {
            if (i < palavra1.length() & i< palavra2.length()) {
                palavraFinal.append(palavra1.charAt(i));
                palavraFinal.append(palavra2.charAt(i));
            } else if (i < palavra1.length() && i < palavra2.length()) {
                palavraFinal.append(palavra1.charAt(i));
            } else {
                palavraFinal.append(palavra2.charAt(i));
            }
        }
        System.out.printf("\n%s", palavraFinal);
    }
}