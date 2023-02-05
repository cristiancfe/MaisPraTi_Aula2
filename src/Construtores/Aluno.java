package Construtores;

import java.util.Random;

public class Aluno {

    Random random = new Random();

    int matricula ;
    String nome;
    String email;
    boolean estaAtivo;
    double nota;

    public Aluno(int matricula, String nome, String email){
        this.matricula = matricula;
        this.nome = nome;
        this.email =email;
    }


    public void fazerProva() {
        System.out.println("Nota do aluno que fez a prova");
        nota = random.nextInt(100) + 1;
    }

    public double obterNota() {
        return nota;
    }
}
