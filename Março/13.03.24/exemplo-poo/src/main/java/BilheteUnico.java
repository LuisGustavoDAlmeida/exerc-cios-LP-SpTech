public class BilheteUnico {
    // Atributos = Características
    String codigo;
    Double saldo;
    String nomeTitular;

    // Métodos = Comportamentos

    // Saldo já é um atributo, então não precisamos passar de parâmetro, igual na vida real o bilhete
    // já possui o saldo, mas não possui o valor de recarga, porque eu ainda irei colocar
    // Só recebemos como argumento um parâmetro que NÃO EXISTE dentro do próprio objeto
    void carregar (Double valor) {
        if (valor <= 0) {
            System.out.println("Valor de recarga inválido");
        } else {
            saldo += valor;
            System.out.println("Recarga efetuada");
        }
    }
}
