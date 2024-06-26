package ex04;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro01 = new Termometro();
        termometro01.temperaturaMax = 15;
        termometro01.temperaturaMin = 7;
        termometro01.temperaturaAtual = 2;

        Termometro termometro02 = new Termometro();
        termometro02.temperaturaMax = 45;
        termometro02.temperaturaMin = 23;
        termometro02.temperaturaAtual = 35;

        System.out.println("A temperatura do termômetro 1 atualmente é: " + termometro01.temperaturaAtual);
        termometro01.aumentaTemperatura(3);
        System.out.println("A temperatura do termômetro 1 atualmente é: " + termometro01.temperaturaAtual);
        termometro01.diminuiTemperatura(4);
        System.out.println("A temperatura do termômetro 1 atualmente é: " + termometro01.temperaturaAtual);
        termometro01.exibeFahreinheit();
        System.out.println("\n \n");
        System.out.println("A temperatura do termômetro 2 atualmente é: " + termometro02.temperaturaAtual);
        termometro02.aumentaTemperatura(25);
        System.out.println("A temperatura do termômetro 2 atualmente é: " + termometro02.temperaturaAtual);
        termometro02.diminuiTemperatura(40);
        System.out.println("A temperatura do termômetro 2 atualmente é: " + termometro02.temperaturaAtual);
        termometro02.exibeFahreinheit();
    }
}
