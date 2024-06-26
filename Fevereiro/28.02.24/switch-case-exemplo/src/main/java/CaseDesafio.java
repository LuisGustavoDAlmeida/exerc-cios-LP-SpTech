import java.util.Scanner;

public class CaseDesafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer escolhaNum;

        Calculadora calc = new Calculadora();
        Utilitaria util = new Utilitaria();

        do{
            util.exibirMenu();
            escolhaNum = leitor.nextInt();

        } while(escolhaNum != 1 && escolhaNum != 2 && escolhaNum != 3);

        Integer num1;
        Integer num2;
        Integer resultado;

            switch (escolhaNum) {
                case 1 -> {
                    System.out.println("Qual o primeiro número?");
                    num1 = leitor.nextInt();
                    System.out.println("Qual o segundo número?");
                    num2 = leitor.nextInt();

                    Integer resultadoMetodo = calc.somar(num1, num2);
                    System.out.println("Resultado: %d".formatted(resultadoMetodo));

                    calc.somar(num1, num2, 5); // O que você passa aqui é um parâmetro

                }
                case 2 -> {
                    System.out.println("Qual o primeiro número?");
                    num1 = leitor.nextInt();
                    System.out.println("Qual o segundo número?");
                    num2 = leitor.nextInt();

                    Integer resultadoMetodo = calc.subtrair(num1,num2);
                    System.out.println("Resultado: %d".formatted(resultadoMetodo));

                }
                case 3 -> {
                    System.out.println("Qual o primeiro número?");
                    num1 = leitor.nextInt();
                    System.out.println("Qual o segundo número?");
                    num2 = leitor.nextInt();

                    Integer resultadoMetodo = calc.multiplicar(num1, num2);
                    System.out.println("Resultado: %d".formatted(resultadoMetodo));
                }
                case 0 -> {
                    System.out.println("Adeus, até nunca mais");
                    System.exit(0);
                }
               // default -> System.out.println("Número inválido");
            }
    }
}
