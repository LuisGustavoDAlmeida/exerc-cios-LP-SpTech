public class PetShop {
    private String nome;
    private Double faturamentoTotal;
    private Double valorBanho;

    public PetShop(String nome, Double faturamentoTotal) {
        this.nome = nome;
        this.faturamentoTotal = faturamentoTotal;
        valorBanho = 40.0;
    }

    public void darBanho(Pet pet){
        // Essa é a visão contrária, você joga a regra de negócio em 1 método só.
        // É necessário prestar atenção no que rege a regra principal para cortar código das sobrecargas.
        darBanho(pet, 0.0);
    }

    public void darBanho (Pet pet, Double desconto) {
        // Ele altera os atributos do próprio PetShop e do pet, ele altera os atributos de 2 classes
        Double valorComDesconto = (valorBanho - (valorBanho * desconto));
        faturamentoTotal += valorComDesconto;
        pet.tomarBanho(valorComDesconto);
    }

    public PetShop() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamentoTotal() {
        return faturamentoTotal;
    }

    public void setFaturamentoTotal(Double faturamentoTotal) {
        this.faturamentoTotal = faturamentoTotal;
    }

    public Double getValorBanho() {
        return valorBanho;
    }

    public void setValorBanho(Double valorBanho) {
        this.valorBanho = valorBanho;
    }
}
