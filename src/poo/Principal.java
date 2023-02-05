package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Aluno aluno01 = new Aluno();
        aluno01.nome = "Cristian";
        aluno01.email = "Cristian@gmail.com";
        //aluno01.matricula = 1002023;// matricula setada, mas esta implementada matricula randomica
        aluno01.estaAtivo = true;

        aluno01.fazerProva();

        System.out.println("O aluno : "+aluno01.nome + " de matricula " + aluno01.matricula+" obteve a nota " + aluno01.obterNota());

        System.out.println("***********************************");

        Aluno aluno02 = new Aluno();
        aluno02.nome = "Fabiano";
        aluno02.email = "Fabiano@gmail.com";
        //aluno02.matricula = 2002023; // matricula setada, mas esta implementada matricula randomica
        aluno02.estaAtivo = true;

        aluno02.fazerProva();

        System.out.println("O aluno : "+aluno02.nome + " de matricula " + aluno02.matricula + " obteve a nota " + aluno02.obterNota());

        System.out.println("***********************************");
    }

}
