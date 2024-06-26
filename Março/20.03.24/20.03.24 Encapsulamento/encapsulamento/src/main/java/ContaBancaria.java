public class ContaBancaria {
    // Ao colocar os atributos privados não conseguimos nem utilizá-los no main, agora eles estão selados para serem
    // Utilizados somente aqui nessa classe
    // NullPointerException é tentar manipular algo nulo
    private String nomeTitular;
    private Double saldo;
    private String numeroConta;
    private Integer numeroAgencia;

    // 1° Regra Construtor é sempre publico
    // 2° Regra Tem o mesmo nome da classe
    // Ele parece um método, mas não é um método
    // 3° Não tem retorno
    // 4° Ele pode ser sobrecarregado, então ele é adaptável
    public ContaBancaria(String nomeTitular, String numeroConta, Integer numeroAgencia) {
        this.nomeTitular = nomeTitular;
        // this.saldo = saldo; Tiramos como argumento
        this.saldo = 0.0;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
    }
    public ContaBancaria() {
    }

    void sacar (Double valorSaque) {
        if (valorSaque <= 0 || valorSaque > saldo){
            System.out.println("Valor de saque inválido");
        } else {
            saldo -= valorSaque;
            System.out.println(nomeTitular + "Saque realizado!");
        }
    }
    void depositar (Double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Valor inválido");
        } else {
            saldo += valorDeposito;
            System.out.println("Deposito realizado!");
        }
    }
    void setNomeTitular(String nomeTitular){
        // O this serve pra utilizar um argumento com o mesmo nome de um atributo, o this referencia ao que você
        // Quer que seja referenciado

        // Padrão GET & SET
        // get = buscar
        // set = alterar

        this.nomeTitular = nomeTitular;
    }
    String getNomeTitular(){
        return nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

}

