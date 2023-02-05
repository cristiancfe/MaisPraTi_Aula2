package Construtores;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Aluno aluno01 = new Aluno(100, "Eisenhut", "Cristian@gmail.com");

        aluno01.estaAtivo = true;

        aluno01.fazerProva();

        System.out.println("O(a) aluno(a) : "+aluno01.nome + " de matricula " + aluno01.matricula+" obteve a nota " + aluno01.obterNota());

        System.out.println("***********************************");

        Aluno aluno02 = new Aluno(200, "Sandra", "Fabiano@gmail.com");

        aluno02.estaAtivo = true;

        aluno02.fazerProva();

        System.out.println("O(a) aluno(a) : "+aluno02.nome + " de matricula " + aluno02.matricula + " obteve a nota " + aluno02.obterNota());

        System.out.println("***********************************");
    }

}
