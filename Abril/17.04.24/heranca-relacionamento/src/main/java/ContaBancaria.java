public class ContaBancaria {
    protected String codigoConta;
    protected String nomeTitular;
    protected Double saldo;
    protected Integer qtdOperacoesRealizadas;

    public ContaBancaria(String codigoConta, String nomeTitular) {
        this.codigoConta = codigoConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        this.qtdOperacoesRealizadas = 0;
    }

    public ContaBancaria() {
    }

    public void sacar(Double valorSaque){
        if (valorSaque <= saldo){
            saldo-= valorSaque;
            qtdOperacoesRealizadas++;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void exibeRelatorioOperacoes(){
        System.out.println("""
                O usuário %s realizou %d operações""".formatted(
                        nomeTitular, qtdOperacoesRealizadas
        ));
    }

    public String getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(String codigoConta) {
        this.codigoConta = codigoConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getQtdOperacoesRealizadas() {
        return qtdOperacoesRealizadas;
    }

    public void setQtdOperacoesRealizadas(Integer qtdOperacoesRealizadas) {
        this.qtdOperacoesRealizadas = qtdOperacoesRealizadas;
    }

    @Override
    public String toString() {
        return """
                Código: %s
                Nome: %s
                Saldo %.2f
                quantidade de operações %d""".formatted(
                        codigoConta, nomeTitular, saldo, qtdOperacoesRealizadas
        );
    }
}
