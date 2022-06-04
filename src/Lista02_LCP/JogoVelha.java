package Lista02_LCP;

import java.util.Scanner;

public class JogoVelha {

    public static void tabuleiro(char [][]matriz){
        
        for(int i=0; i<3;i++){
            System.out.printf("%c %c %c\n", matriz[i][0], matriz[i][1], matriz[i][2]);
            
        }
    }

    public static boolean ganhouLinha(char [][]matriz){
        for(int i=0;i<3;i++){
            if (matriz[i][0] == matriz[i][1] && matriz[i][0] == matriz[i][2]
            && matriz[i][0] != '_' && matriz[i][1] != '_' && matriz[i][2] != '_') return true;
        }
        return false;
    }

    public static boolean ganhouColuna(char [][]matriz){
        for(int j=0;j<3;j++){
            if (matriz[0][j] == matriz[1][j] && matriz[0][j] == matriz[2][j] 
            && matriz[0][j] != '_' && matriz[1][j] != '_' && matriz[2][j] != '_') return true;
        }
        return false;
    }

    public static boolean ganhouDiagonais(char [][]matriz){
        for(int j=0;j<3;j++){
            if(matriz[1][1] != '_'){
                if (matriz[1][1] == matriz[0][0] && matriz[1][1] == matriz[2][2]) return true;
                if (matriz[1][1] == matriz[0][2] && matriz[1][1] == matriz[2][0]) return true;
            }
        }
        return false;
    }

    public static boolean aindaTemJogo(char [][]matriz){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matriz[i][j] == '_') return false;
            }
        }
        return true;
    }

    public static boolean jogoAcabou(char [][]matriz){
        if(aindaTemJogo(matriz)) return true;
        return false;
    }

    public static boolean ganhador(char [][]matriz){
        if(ganhouDiagonais(matriz) || ganhouLinha(matriz) || ganhouColuna(matriz)) return true;
        return false;
     }



    public static char[][] atualizaTabuleiro(char [][]matriz, int []jogada, char jogador){
        int linha = jogada[0];
        int coluna = jogada[1];

        matriz[linha][coluna] = jogador;

        return matriz;
    }

    public static void realizaJogada(char [][]matriz, String jogador, char carac){
        Scanner scan = new Scanner(System.in);

        int posicao;
        int[] jogada = new int[2];
        System.out.printf("%s, digite a linha da sua jogada ", jogador);
        posicao = scan.nextInt();
        jogada[0] = posicao;
        System.out.printf("%s, digite a coluna da sua jogada ", jogador);
        posicao = scan.nextInt();
        jogada[1] = posicao;
        

        matriz = atualizaTabuleiro(matriz, jogada, carac);
        tabuleiro(matriz);
        
        
    }


    public static void main(String[] args) {
        char [][]matriz = { {'_','_','_'}, {'_','_','_'}, {'_','_','_'}};

        Scanner scan = new Scanner(System.in);

        while(jogoAcabou(matriz) == false || ganhador(matriz) == false){
           
            realizaJogada(matriz, "Jogador 1", 'X');
            if(ganhador(matriz)) {
                scan.close();
                System.out.println("Resultado da partida: Jogador 1 eh o vencedor");
                return;
            }
            if(jogoAcabou(matriz)) break;

            realizaJogada(matriz, "Jogador 2", 'O');
            if(ganhador(matriz)) {
                scan.close();
                System.out.println("Resultado da partida: Jogador 2 eh o vencedor");
                return;
            }
            if(jogoAcabou(matriz)) {
                scan.close();
                break;
            } 
        }
        System.out.println("Resultado da partida: Deu Velha!!!");

        scan.close();


    }
}
