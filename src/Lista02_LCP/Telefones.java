package Lista02_LCP;

import java.util.Scanner;

public class Telefones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String telefone = scan.nextLine();
        scan.close();
        String regex_celular = "\\([0-9]{2}\\)[0-9]{5}-[0-9]{4}";
        String regex_fixo = "\\([0-9]{2}\\)[0-9]{4}-[0-9]{4}";

        if(telefone.matches(regex_celular)){
            System.out.println("Numero eh de telefone celular");
        }

        if(telefone.matches(regex_fixo)){
            System.out.println("Numero eh de telefone fixo");
        }

        String numeros[] = telefone.split("\\)");
        System.out.printf("O DDD é %s e o telefone é %s", numeros[0].substring(1), numeros[1]);
    }
}
