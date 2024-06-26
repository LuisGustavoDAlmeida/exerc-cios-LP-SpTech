import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Teste {
    public static void main(String[] args) {

        // Exemplo método, não é uma variável, e sim um objeto!
        // Para criar um objeto utilizamos o new
        // Instância = criar um objeto, ao colocar o new você cria um objeto do exemploMetodo
        String teste;
        ExemploMetodo exemploMetodo = new ExemploMetodo();
        exemploMetodo.apresentarUsuario("César");

        Double valorTaxa = exemploMetodo.calcularTaxa(1050.0);
        System.out.println("A taxa é: " +valorTaxa);

        // Exemplo de sobrecarga
        exemploMetodo.apresentarUsuario("Bob", "Da Silva");

        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt();

        List<String> nomes = new ArrayList<String>();
        nomes.add("Bob da Silva");
        nomes.add("Maria");
        nomes.add("José");
        exemploMetodo.exibirNomes(nomes);
    }

}
