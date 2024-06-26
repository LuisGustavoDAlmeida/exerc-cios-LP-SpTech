package mini.desafio;

public class MiniDesafio {
    public static void main(String[] args) {
        Cofrinho cofrinho01 = new Cofrinho();
        Cofrinho cofrinho02 = new Cofrinho();

        cofrinho01.valorCofrinho = 0.0;
        cofrinho02.valorCofrinho = 0.0;


        cofrinho01.depositar(50.0);
        System.out.println(cofrinho01.valorCofrinho);
        cofrinho01.depositar(50.0);
        System.out.println(cofrinho01.valorCofrinho);

        cofrinho02.depositar(100.0);
        System.out.println(cofrinho02.valorCofrinho);
        cofrinho02.depositar(100.0);
        System.out.println(cofrinho02.valorCofrinho);

        System.out.println("Seu cofrinho tem " + cofrinho01.agitarCofrinho());
    }
}
