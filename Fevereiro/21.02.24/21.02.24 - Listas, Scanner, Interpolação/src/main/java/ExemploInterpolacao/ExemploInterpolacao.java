package ExemploInterpolacao;

public class ExemploInterpolacao {
    public static void main(String[] args) {
        String nome = "Okarin";
        Double altura = 1.88;
        Integer idade = 19;

        // Na interpolação usamos:
        // %s para String;
        // %d para Inteiros;
        // %.2f para Double (2 representa a quantidade de casas decimais).
        // %b para booleano.

        String fraseFormatada = String.format(
                """
                Meu nome é: %s
                Minha altura é: %.2f
                Minha idade é: %d
                Nome do meu pet: %s""", nome, altura, idade, "Zero");

        Boolean petVacinado = false;
        String fraseFormatadaAlternative = """
                Meu nome é: %s
                Minha idade é: %d
                Minha altura é: %.2f
                Nome do meu pet é: %s
                Pet Vacinado: %s""".formatted(nome, idade, altura, "Zero", petVacinado ? "Sim" : "Não");

        System.out.println(fraseFormatadaAlternative);

        // Se tiver menos de 15 anos o salário é 800 reais;
        // Se tiver mais de 15 anos o salário é 1600 reais;

        // Operador ternário
        Integer idadeParaSalario = 15;
        Double salario = idadeParaSalario < 15 ? 800.0 : 1600.0;
        Boolean maiorIdade = idade >= 18; // Aqui ele sempre dará true, ou seja a variável será true
    }
}