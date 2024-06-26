package com.sptech;

public class Main {
    public static void main(String[] args) {
        Atividade atividade01 = new Atividade("Tomar banho",
                "Luis",
                4);

        Atividade atividade02 = new Atividade("Dar banho no peixe",
                "Luis",
                15);

        System.out.println(atividade01);
        atividade01.terminarAtividade(5);
        System.out.println(atividade01);
        atividade01.exibirRelatorio();

        System.out.println("Segunda atividade");

        System.out.println(atividade02);
        atividade02.terminarAtividade(2);
        System.out.println(atividade02);
        atividade02.exibirRelatorio();
    }
}
