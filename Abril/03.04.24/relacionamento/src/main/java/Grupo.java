import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nomeGrupo;
    // Apesar de não estar no diagrama o contato deve ser incluído como atributo. A multiplicidade
    // Deixa isso implicito.
    private List<Contato> contatos;

    public Grupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
        this.contatos = new ArrayList<>();
    }

    public void adiciona(Contato c){
        contatos.add(c);
    }

    public void remove(Contato c){
        // Usando indexOf -- AQUI ELE FUNCIONA, PORQUE ESTÁ UTILIZANDO UM CONTATO
        int index = contatos.indexOf(c);
        contatos.remove(index);

        // Removendo usando o for -- NA PROVA UTILIZAR ESSE AQUI
        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoDaVez = contatos.get(i);
            if (contatoDaVez.getNome().equals(c.getNome())){
                contatos.remove(i);
                i--;
            }
        }
    }

    public void adicionarMuitos(List<Contato> novosContatos) {
        contatos.addAll(novosContatos);
    }

    public void exibirPorNome(String nome){
        for(Contato contatoDaVez : contatos){ // Esse for vai passar obrigatoriamente
            // por todos os itens da lista e exibir se for verdade.
            // NÃO UTILIZAR ELE PRA REMOVER ITENS, ELE VAI APAGAR TUDO.
            // UTILIZAR ELE QUANDO O OBJETO DA LISTA IMPORTA
            if (contatoDaVez.getNome().equalsIgnoreCase(nome)){
                System.out.println(contatoDaVez);
            }
        }
        for (int i = 0; i < contatos.size(); i++) {
            // QUANDO ALGO DA LISTA IMPORTA, UTILIZAR O FOR NORMAL
            Contato contatoDaVez = contatos.get(i);
            if (contatoDaVez.getNome().equalsIgnoreCase(nome)){
                System.out.println(contatoDaVez);
            }
        }
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    } // Quando a gente usa isso? Ele fala que os contatos são uma lista, ou seja, ele cria //
    // Então a lista original é sobrescrita pela nova.


    @Override
    public String toString() {
        return """
                Nome do Grupo: %s
                Contatos do Grupo: %s
                """.formatted(nomeGrupo, contatos);
    }
}

