package Lista02_LCP;

import java.util.Scanner;

public class Verifica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rg = scan.nextLine();
        scan.close();
        String regex_rg_1 = "[0-9]{1,2}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{1}";
        String regex_rg_2 = "[0-9]{1,2}\\.[0-9]{3}\\.[0-9]{3}-x";
        String regex_rg_3 = "[0-9]{1,2}\\.[0-9]{3}\\.[0-9]{3}-X";
        if(rg.matches(regex_rg_1) || rg.matches(regex_rg_2) || rg.matches(regex_rg_3)){
            System.out.println("RG eh valido");
            return;
        }
        System.out.println("RG nao eh valido");
    }
}
