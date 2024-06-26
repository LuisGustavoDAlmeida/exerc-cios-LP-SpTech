package ex01Refatorado;

public class BoloRefatorado {
    private String sabor;
    private Double valor;
    private Integer qtdVendida;

    public BoloRefatorado(String sabor, Double valor, Integer qtdVendida) {
        this.sabor = sabor;
        this.valor = valor;
        this.qtdVendida = qtdVendida;
    }
    public BoloRefatorado(){

    }

    void comprarBolo(Integer qtdBolo){
        if (qtdBolo + qtdVendida > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        } else {
            qtdVendida += qtdBolo;
        }
    }
    void exibirRelatorio(){
        System.out.println("""
                O bolo sabor %s, foi comprado %d vezes hoje, totalizando %.2f""".formatted(sabor,
                qtdVendida, (valor * qtdVendida)));
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(Integer qtdVendida) {
        this.qtdVendida = qtdVendida;
    }
}
