public class Contato {
    private String nome;
    private String telefone;
    private Boolean bloqueado;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
    }

    public Contato() {
    }
    // Já temos dois métodos para bloquear e desbloquear, apesar do set fazer o mesmo em 1 método
    // Só, faz mais sentido ter os 2 métodos, devido a POO, uma perspectiva humana, além do set
    // Ser mais técnico.
    public void bloquear(){
        bloqueado = true;
    }
    public void desbloquear(){
        bloqueado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Telefone: %s
                Bloqueado: %s""".formatted(nome,
                telefone,
                (bloqueado ? "Sim" : "Não"));
    }
}
