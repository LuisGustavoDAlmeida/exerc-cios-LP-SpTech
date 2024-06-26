package ex01Refatorado;

public class AppRefatorado {
    public static void main(String[] args) {
        BoloRefatorado bolo01 = new BoloRefatorado("Chocolate", 37.5, 15);
        BoloRefatorado bolo02 = new BoloRefatorado("Morango", 12.5, 7);
        BoloRefatorado bolo03 = new BoloRefatorado("Abacaxi", 87.5, 75);
        BoloRefatorado bolo04 = new BoloRefatorado();

        bolo01.comprarBolo(2);
        bolo01.exibirRelatorio();
    }
}
