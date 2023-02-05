package poo;

import java.util.Random;

public class Aluno {

    Random random = new Random();

    int matricula = random.nextInt(10000);
    String nome;
    String email;
    boolean estaAtivo;
    double nota;


    public void fazerProva() {
        System.out.println("Nota do aluno que fez a prova");
        nota = random.nextInt(100) + 1;
    }

    public double obterNota() {
        return nota;
    }
}
