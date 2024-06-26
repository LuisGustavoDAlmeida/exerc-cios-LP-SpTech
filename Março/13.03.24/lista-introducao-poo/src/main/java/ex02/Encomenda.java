package ex02;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;

    Double calcularFrete(){

        Double freteEncomenda = 0.0;
        Double freteDistancia = 0.0;

        switch (tamanho) {
            case "P":
                freteEncomenda = valorEncomenda * 0.01;
                break;
            case "M":
                freteEncomenda = valorEncomenda * 0.03;
                break;
            case "G":
                freteEncomenda = valorEncomenda * 0.05;
                break;
            default:
                System.out.println("Selecione um tamanho válido para a sua encomenda");
        }
        if (distancia <= 50) {
            freteDistancia = 3.00;
        } else if (distancia <= 200) {
            freteDistancia = 5.00;
        } else {
            freteDistancia = 7.00;
        }
        Double freteTotal = freteDistancia + freteEncomenda;
        return freteTotal;
    }

    void emitirEtiqueta(Double freteTotal) {
        System.out.println("""
                ***** ETIQUETA PARA ENVIO *****
                Endereço do remetente: %s
                Endereço do destinatário: %s
                Tamanho: %s
                --------------------------------------------------
                Valor encomenda: %.2f
                Valor frete: %.2fR$ 
                --------------------------------------------------
                Valor total: R$ %.2f""".formatted(enderecoRemetente, enderecoDestinatario,
                tamanho, valorEncomenda, freteTotal, (valorEncomenda + freteTotal)));
    }
}
