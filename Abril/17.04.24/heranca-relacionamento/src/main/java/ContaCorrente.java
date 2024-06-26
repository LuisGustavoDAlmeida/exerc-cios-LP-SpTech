public class ContaCorrente extends ContaBancaria {
    private Double limiteChequeEspecial;

    public ContaCorrente(String codigoConta, String nomeTitular, Double limiteChequeEspecial) {
        super(codigoConta, nomeTitular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    public ContaCorrente(){

    }

    @Override
    public void sacar(Double valorSaque) {
        Double valorSaquePermitido = saldo + limiteChequeEspecial;

        if (valorSaque <= valorSaquePermitido) {
            saldo -= valorSaque;
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saque não realizado");
        }
    }

    public Double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
    public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    @Override
    public String toString() {
        return """
                %s
                Limite Cheque Especial: %.2f""".formatted(super.toString(), limiteChequeEspecial);
    }
}
