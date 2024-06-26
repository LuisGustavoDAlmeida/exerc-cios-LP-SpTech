public class Alimento extends Produto{
    private Integer qtdVitaminas;

    public Alimento(Integer codigo, String descricao, Double preco, Integer qtdVitaminas) {
        super(codigo, descricao, preco);
        this.qtdVitaminas = qtdVitaminas;
    }

    @Override
    public Double getValorTributo() {
        return qtdVitaminas * 0.50;
    }

    public Integer getQtdVitaminas() {
        return qtdVitaminas;
    }

    public void setQtdVitaminas(Integer qtdVitaminas) {
        this.qtdVitaminas = qtdVitaminas;
    }
}
