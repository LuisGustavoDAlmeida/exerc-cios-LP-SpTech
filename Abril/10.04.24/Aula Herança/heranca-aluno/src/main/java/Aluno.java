public class Aluno {
    protected String nome;
    protected Double notaContinuada;
    protected Double notaEntrega;

    public Aluno(String nome, Double notaContinuada, Double notaEntrega) {
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaEntrega = notaEntrega;
    }

    public Double calcularNotaFinal(){
        return notaContinuada + notaEntrega;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaEntrega() {
        return notaEntrega;
    }

    public void setNotaEntrega(Double notaEntrega) {
        this.notaEntrega = notaEntrega;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", notaContinuada=" + notaContinuada +
                ", notaEntrega=" + notaEntrega +
                '}';
    }
}
