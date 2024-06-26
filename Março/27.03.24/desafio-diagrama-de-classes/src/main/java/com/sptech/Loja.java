package com.sptech;

public class Loja {
    private String nomeLoja;
    private Integer qtdVendas;
    private Integer qtdMetaVendas;
    private Double valorTotalVendas;

    public Loja(String nomeLoja, Integer qtdVendas, Integer qtdMetaVendas, Double valorTotalVendas) {
        this.nomeLoja = nomeLoja;
        this.qtdVendas = qtdVendas;
        this.qtdMetaVendas = qtdMetaVendas;
        this.valorTotalVendas = valorTotalVendas;
    }
    public void realizarVenda(Double valorVenda){
        valorTotalVendas += valorVenda;
        qtdVendas++;
    }
    public void realizarVenda(Double valorVenda, Double valorDesconto){
        valorTotalVendas += valorVenda - valorDesconto;
        qtdVendas++;
    }
    public Boolean verificarMeta(){
        if (qtdMetaVendas > valorTotalVendas) {
            return true;
        } else {
            return false;
        }
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Integer getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(Integer qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public Integer getQtdMetaVendas() {
        return qtdMetaVendas;
    }

    public void setQtdMetaVendas(Integer qtdMetaVendas) {
        this.qtdMetaVendas = qtdMetaVendas;
    }

    public Double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(Double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }

    @Override
    public String toString() {
        if (verificarMeta().equals(true)){
            return """
                    Nome da Loja: %s
                    Quantidade de Vendas: %d
                    Quantidade da Meta de Vendas: %d
                    Valor Total Das Vendas: %.2f
                    
                    A quantidade de metas é de %d e você alcançou %d vendas
                    Parabéns!!!""".formatted(
                            nomeLoja, qtdVendas, qtdMetaVendas, valorTotalVendas, qtdMetaVendas, qtdVendas
            );
        } else {
            return """
                    Nome da Loja: %s
                    Quantidade de Vendas: %d
                    Quantidade da Meta de Vendas: %d
                    Valor Total Das Vendas: %.2f
                    
                    A quantidade de metas é de %d e você alcançou %d vendas
                    Que pena, ainda faltam %d vendas para você atingir a meta""".formatted(
                    nomeLoja, qtdVendas, qtdMetaVendas, valorTotalVendas, qtdMetaVendas, qtdVendas,
                    (qtdMetaVendas - qtdVendas)
            );
        }
    }
}
