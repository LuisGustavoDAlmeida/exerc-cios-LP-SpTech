import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nomeBanco;
    private List<ContaBancaria> contas;

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        this.contas = new ArrayList<>();
    }

    public void cadastrarConta(ContaBancaria conta){
        contas.add(conta);
    }

    public void exibirContas(){
        for(ContaBancaria contaDaVez : contas){
            System.out.println(contaDaVez);
        }
    }
    public void exibirContasPoupanca(){
        for(ContaBancaria contaDaVez : contas){
            if(contaDaVez instanceof ContaPoupanca){
                System.out.println(contaDaVez);
            }
        }
    }
    public void exibirContaCorrenteComMenorLimiteChequeEspecial(){
        Double menorCredito = 0.0;
        ContaCorrente contaEncontrada = null;
        for (ContaBancaria contaBancaria : contas) {
            if (contaBancaria instanceof ContaCorrente){
                ContaCorrente contaCorrenteDaVez = (ContaCorrente) contaBancaria;
                if(contaCorrenteDaVez.getLimiteChequeEspecial() < menorCredito){
                    contaEncontrada = contaCorrenteDaVez;
                }
            }
        }
    }
}
