public class Carro extends Veiculo {
    private Double nivelOleo;
    private Boolean possuiEstepe;

    public Carro(String nomeCliente, String marca, Double valor, Double nivelOleo, Boolean possuiEstepe) {
        super(nomeCliente, marca, valor);
        this.nivelOleo = nivelOleo;
        this.possuiEstepe = possuiEstepe;
    }

    public Double getNivelOleo() {
        return nivelOleo;
    }

    public void setNivelOleo(Double nivelOleo) {
        this.nivelOleo = nivelOleo;
    }

    public Boolean getPossuiEstepe() {
        return possuiEstepe;
    }

    public void setPossuiEstepe(Boolean possuiEstepe) {
        this.possuiEstepe = possuiEstepe;
    }

    @Override
    public void exibirRelatorioRevisao() {
        System.out.println("Relatório do Carro de: " + nomeCliente);
        if (nivelOleo < 1.5){
            System.out.println("Nível de óleo baixo, troque aqui!");
        } else {
            System.out.println("Nível de óleo ok");
        }

        if (possuiEstepe){
            System.out.println("Estepete ok");
        } else {
            System.out.println("Compre o esqtepe aqui");
        }
    }
}
