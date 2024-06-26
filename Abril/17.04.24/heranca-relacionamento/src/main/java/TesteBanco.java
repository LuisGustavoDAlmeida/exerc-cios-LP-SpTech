public class TesteBanco {
    public static void main(String[] args) {
        Banco banco01 = new Banco("Meta");
        ContaCorrente contaCorrente01 = new ContaCorrente("CC900",
                "Julia Campioto",
                1300.0);
        ContaPoupanca contaPoupanca01 = new ContaPoupanca("CP004",
                "Zé");
        ContaBancaria contaBancaria01 = new ContaBancaria("CB003", "Eliope");

        banco01.cadastrarConta(contaCorrente01);
        banco01.cadastrarConta(contaPoupanca01);
        banco01.cadastrarConta(contaBancaria01);

        banco01.exibirContas();
        banco01.exibirContasPoupanca();
    }
}
