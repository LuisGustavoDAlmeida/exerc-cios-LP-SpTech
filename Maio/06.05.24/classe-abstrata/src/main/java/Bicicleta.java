public class Bicicleta extends Veiculo {
    private Double nivelCalibragemPneu;

    public Bicicleta(String nomeCliente, String marca, Double valor, Double nivelCalibragemPneu) {
        super(nomeCliente, marca, valor);
        this.nivelCalibragemPneu = nivelCalibragemPneu;
    }

    public void exibirRelatorioRevisao(){
        System.out.println("Relatório da bike de: " + nomeCliente);
        if (nivelCalibragemPneu < 0.8){
            System.out.println("Calibragem ok");
        } else {
            System.out.println("Calibragem");
        }
    }

    public Double getNivelCalibragemPneu() {
        return nivelCalibragemPneu;
    }

    public void setNivelCalibragemPneu(Double nivelCalibragemPneu) {
        this.nivelCalibragemPneu = nivelCalibragemPneu;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "nivelCalibragemPneu=" + nivelCalibragemPneu +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                '}';
    }
}
