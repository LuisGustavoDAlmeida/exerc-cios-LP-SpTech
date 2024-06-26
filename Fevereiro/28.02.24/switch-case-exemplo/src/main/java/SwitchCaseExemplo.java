import java.util.Scanner;

public class SwitchCaseExemplo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número do dia da semana");
        Integer diaDaSemana = leitor.nextInt();
        switch (diaDaSemana) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Aula de LP");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sextou GALERA!!!!!!!!!!!!!!!!!");
                break;
            default:
                System.out.println("Você não digitou um número válido!");
        }

        switch (diaDaSemana) {
            case 1 -> System.out.println("Segunda");
            case 2 -> System.out.println("Terça");
            case 3 -> System.out.println("Aula de LP");
            case 4 -> System.out.println("Quinta");
            case 5 -> System.out.println("Sextou GALERA!!!!!!!!!!!!!!!!!");
            default -> System.out.println("Você não digitou um número válido!");
        }

        // Cuidado: sensitive case!
        String fruta = "Laranja";

        switch ((fruta)) { // É sensível utilizar o switch case com strings, só se for algo bem específico mesmo
            case "maçã":
                System.out.println("Temos no estqoue!");
                break;
            case "Laranja":
                System.out.println("Não temos no estoque");
                break;

        }
    }
}
