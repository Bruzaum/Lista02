package Lista02_LCP;

import java.util.ArrayList;
import java.util.List;

public class Exercicio07 {


    public static class Aluno{

        String ra;
        String nome;
        String curso;
        int idade;

        public Aluno(String ra, String nome, String curso,int idade){
            this.nome = nome;
            this.ra = ra;
            this.curso = curso;
            this.idade = idade;
        }
    }
    public static Aluno removeAluno(String ra, List<Aluno> lista){
        for(Aluno aluno : lista){
            if(aluno.ra == ra){
                return aluno;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Aluno aluno = new Aluno(ra, nome, curso, idade);
        List<Aluno> lista = new ArrayList<Aluno>();
        Aluno aluno1 = new Aluno("1234567", "Bruno", "Computacao", 22);
        Aluno aluno2 = new Aluno("0001112", "Isabela", "Matematica", 23);
        Aluno aluno3 = new Aluno("7654321", "Joao", "Biologia", 17);
        Aluno aluno4 = new Aluno("0147852", "Ivan", "Computacao", 30);
        Aluno aluno5 = new Aluno("9513576", "Marina", "Eng Ambiental", 21);
        
        lista.add(aluno1);
        lista.add(aluno2);
        lista.add(aluno3);
        lista.add(aluno4);
        lista.add(aluno5);

        System.out.println("Lista de Alunos antes da remocao:");
        for(Aluno aluno: lista){
            System.out.printf("Nome:%s\nCurso:%s\nRA:%s\nIdade:%d\n", aluno.nome,aluno.curso,aluno.ra, aluno.idade);
            System.out.println(); 
        }
        
        Aluno removeAluno = removeAluno("0147852", lista);
        if (removeAluno != null){
            lista.remove(removeAluno);
            System.out.println("Lista de Alunos apos a remocao:");
            for(Aluno aluno: lista){
                System.out.printf("Nome:%s\nCurso:%s\nRA:%s\nIdade:%d\n", aluno.nome,aluno.curso,aluno.ra, aluno.idade);
                System.out.println();
            }
        }else{
            System.out.println("Nenhum aluno foi removido!\nErro: RA nao encontrado\n\n");
        };

    }
}