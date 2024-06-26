package ex02;

public class TesteEncomenda {
    public static void main(String[] args) {
        Encomenda encomenda01 = new Encomenda();
        Encomenda encomenda02 = new Encomenda();

        encomenda01.tamanho = "M";
        encomenda01.enderecoRemetente = "Rua Desejo da Noite, 12";
        encomenda01.enderecoDestinatario = "Rua Desprezar da manhã, 22";
        encomenda01.distancia = 30.3;
        encomenda01.valorEncomenda = 105.0;

        encomenda02.tamanho = "G";
        encomenda02.enderecoRemetente = "Rua Fim dos Dias, 15";
        encomenda02.enderecoDestinatario = "Rua Início dos Tempos, 7";
        encomenda02.distancia = 500.8;
        encomenda02.valorEncomenda = 800.0;

        Double valorFrete1 = encomenda01.calcularFrete();
        Double valorFrete2 = encomenda02.calcularFrete();

        encomenda01.emitirEtiqueta(valorFrete1);
        System.out.println("\n");
        encomenda02.emitirEtiqueta(valorFrete2);
    }
}
