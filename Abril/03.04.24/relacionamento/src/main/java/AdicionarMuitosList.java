import java.util.ArrayList;
import java.util.List;

public class AdicionarMuitosList {
    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();

        Contato contato01 = new Contato();
        contato01.setNome("Crush");
        contato01.setTelefone("123");
        contato01.desbloquear();

        Contato contato02 = new Contato();
        contato02.setNome("Mãe");
        contato02.setTelefone("456");
        contato02.desbloquear();

        Contato contato03 = new Contato();
        contato03.setNome("Crush");
        contato03.setTelefone("789");
        contato03.desbloquear();

        contatos.addAll(List.of(contato01, contato02));

        System.out.println(contatos);
    }
}
