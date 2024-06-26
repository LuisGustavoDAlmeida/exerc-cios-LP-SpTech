package com.sptech;

public class Main {
    public static void main(String[] args) {
        Loja loja01 = new Loja("Loja do Zé",
                0, 2, 0.0);

        System.out.println("Realizando venda...");
        loja01.realizarVenda(10.0);
        System.out.println("Venda realizada \n");

        System.out.println("Realizando venda com desconto");
        System.out.println();loja01.realizarVenda(10.0, 2.0);
        System.out.println("Venda com desconto realizada \n");

        loja01.verificarMeta();
        System.out.println(loja01.toString());
    }
}
