public class Teste {
    public static void main(String[] args) {

        // O ato de "Chamar" o método na verdade é instânciar ele, estamos instanciando um objeto.

        BilheteUnico bilhete01 = new BilheteUnico();

        bilhete01.nomeTitular = "Jeniffer";
        bilhete01.saldo = 0.0;
        bilhete01.codigo = "MG002";
        bilhete01.carregar(420000.0);
        System.out.println("Bilhete 01: " + bilhete01.saldo);

        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "Luis";
        bilhete02.saldo = 0.0;
        bilhete02.codigo = "SP001";
        bilhete02.carregar(-5.0);
        System.out.println("Bilhete 02: " + bilhete02.saldo);

        // O método não retorna nada, mas caso tivesse uma informação que não fosse o atributo teria
        // Que ter um retorno, então não seria void.
        // Aqui não precisamos de um retorno, afinal o saldo é uma característica do nosso objeto bilhete

    }
}
