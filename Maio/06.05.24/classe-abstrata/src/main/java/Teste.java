public class Teste {
    public static void main(String[] args) {
        // Não posso chamar métodos da classe veículo, ele é só uma abstração, não posso criá-lo

        Carro carro01 = new Carro("Alguém", "xpto", 34.000,
                1.3, false);
        Bicicleta bike01 = new Bicicleta("Socorro", "monark", 300.0, 1.5);

        System.out.println("Exibindo relatório de revisão dos veículos: ");
        carro01.exibirRelatorioRevisao();
        bike01.exibirRelatorioRevisao();
    }
}


