package ex02Refatorado;

public class TesteEncomendaRefatorado {
    public static void main(String[] args) {
        EncomendaRefatorado encomenda01 = new EncomendaRefatorado("M", "Rua das luas",
                "Rua dos sois",
                34.4, 55.2);

        EncomendaRefatorado encomenda02 = new EncomendaRefatorado("P", "Rua das coisas",
                "Rua das things",
                24.4, 35.2);

        Double valorFrete1 = encomenda01.calcularFrete();
        Double valorFrete2 = encomenda02.calcularFrete();

        encomenda01.emitirEtiqueta(valorFrete1);
        encomenda01.emitirEtiqueta(valorFrete2);

    }
}
