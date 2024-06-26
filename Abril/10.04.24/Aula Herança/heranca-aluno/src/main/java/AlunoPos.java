public class AlunoPos extends Aluno {
    private Double notaArtigo;
    public AlunoPos(String nome, Double notaContinuada, Double notaEntrega, Double notaArtigo) {
        super(nome, notaContinuada, notaEntrega);
        this.notaArtigo = notaArtigo;
    }
    @Override
    public Double calcularNotaFinal() {
        return super.calcularNotaFinal() + notaArtigo;
    }

    @Override
    public String toString() {
        return """
                Nome %s 
                Nota Continuada: %.2f 
                Nota Entrega: %.2f 
                Nota Artigo: %.2f""".formatted(
                        nome, notaContinuada, notaEntrega, notaArtigo
        );
    }
}
