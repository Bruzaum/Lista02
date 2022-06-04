package Lista02_LCP;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        scan.close();

        palavra = palavra.toLowerCase();
        int tam = palavra.length() - 1;

        for (int i = 0; i < palavra.length()/2; i++) {
            if (palavra.charAt(i) == palavra.charAt(tam)) {
                tam--;
            } else {
                System.out.printf("%s Nao eh palindromo", palavra);
                return;
            }
        }
        System.out.printf("%s eh palindromo", palavra);
    }
}
