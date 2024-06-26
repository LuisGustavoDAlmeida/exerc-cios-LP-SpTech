public class TesteBanco {
    public static void main(String[] args) {
        // Os parâmetros dentro dos parênteses é um construtor, serve para passar informações de
        // Valores iniciais de um objeto
        // Você só pode chamar o construtor na hora de instânciar o objeto
        ContaBancaria conta01 = new ContaBancaria("Luis Gustavo", "0123", 05);
        ContaBancaria conta02 = new ContaBancaria();
    }
}
