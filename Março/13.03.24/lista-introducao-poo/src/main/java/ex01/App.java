package ex01;

public class App {
    public static void main(String[] args) {
        Bolo bolo01 = new Bolo();
        Bolo bolo02 = new Bolo();
        Bolo bolo03 = new Bolo();

        bolo01.sabor = "Chocolate";
        bolo02.sabor = "Abacaxi";
        bolo03.sabor = "Morango";

        bolo01.valor = 50.0;
        bolo02.valor = 30.0;
        bolo03.valor = 45.0;

        bolo01.comprarBolo(99);
        bolo02.comprarBolo(9);
        bolo03.comprarBolo(5);

        bolo01.exibirRelatorio();
        bolo02.exibirRelatorio();
        bolo03.exibirRelatorio();

    }
}
