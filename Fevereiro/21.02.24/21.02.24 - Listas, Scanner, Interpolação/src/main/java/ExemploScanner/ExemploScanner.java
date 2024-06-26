package ExemploScanner;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// Se tem uma classe pode virar um objeto, se dá pra abrir segurando o ctrl é objeto também.

public class ExemploScanner {
    public static void main(String[] args) {
        String nome = "Kurisu";
        String nome2 = new String("Kurisu");

        Scanner inputLine = new Scanner(System.in); // Utilizar somente para nextline
        Scanner input = new Scanner(System.in); // Utilizar para tudo menos texto


        System.out.println("Olá, digite seu nome: ");
        String nomeCompleto = inputLine.nextLine(); // Para capturar textos.

        System.out.println("Qual sua idade?");
        Integer idade = input.nextInt(); // Para capturar inteiros.

        System.out.println("Sua área de trabalho: ");
        String trabalho = inputLine.nextLine();

        System.out.println("Qual seu salário: ");
        Double meuSalarioReal = input.nextDouble();

        System.out.println("""
                Seu nome é: %s
                Sua idade é: %d
                Seu trabalho é: %s
                Seu salário real: %.2f""".formatted(nomeCompleto, idade, trabalho, meuSalarioReal));

        input.close();
        inputLine.close();
    }
}
