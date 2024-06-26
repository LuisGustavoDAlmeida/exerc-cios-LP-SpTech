package com.sptech;

public class Atividade {
    // - nomeAtividade: String
    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados = 0;

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = diasUsados;
    }
    public void terminarAtividade(Integer diasUsados){
        this.diasUsados = diasUsados; // O parâmetro que passamos será atribuido ao atributo, por
        // Isso o this
    }
    public void exibirRelatorio(){
        if (diasEstimados < diasUsados) {
            System.out.println("""
                Você estimou %d dias, mas a tarefa foi feita em %d dias, (%d dias a mais que o estimado)
                Melhore a estimativa.""".formatted(
                    diasEstimados, diasUsados, (diasUsados - diasEstimados)
            ));
        } else if (diasEstimados > diasUsados) {
            System.out.println("""
                Você estimou %d dias, mas a tarefa foi feita em %d dias, (%d dias a mais que o estimado)
                Parabéns.""".formatted(
                    diasEstimados, diasUsados, (diasEstimados - diasUsados)
            ));
        } else {
            System.out.println("""
                Você estimou %d dias, mas a tarefa foi feita em %d dias
                Atendendo a estimativa com precisão.""".formatted(
                    diasEstimados, diasUsados
            ));
        }
    }
    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }
    @Override
    public String toString() { // Ele é literalmente uma "foto" de como meu objeto está atualmente
        return """
                Nome atividade: %s
                Responsável: %s
                Dias Estimados: %d
                Dias Usados: %d \n \n""".formatted(
                nomeAtividade,
                responsavel,
                diasEstimados,
                diasUsados);
    }
}
