package ex02Refatorado;

public class EncomendaRefatorado {
    private String tamanho;
    private String enderecoRemetente;
    private String enderecoDestinatario;
    private Double distancia;
    private Double valorEncomenda;

    public EncomendaRefatorado(String tamanho, String enderecoRemetente,
                               String enderecoDestinatario, Double distancia, Double valorEncomenda) {
        this.tamanho = tamanho;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }

    public EncomendaRefatorado(){

    }

    Double calcularFrete(){

        Double freteEncomenda = 0.0;
        Double freteDistancia;

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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(String enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getValorEncomenda() {
        return valorEncomenda;
    }

    public void setValorEncomenda(Double valorEncomenda) {
        this.valorEncomenda = valorEncomenda;
    }
}


