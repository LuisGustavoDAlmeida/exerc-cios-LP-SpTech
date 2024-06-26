package ex03Refatorado;

public class EmpregadoRefatorado {
    private String nome;
    private String cargo;
    private Double salario = 0.0;

    public EmpregadoRefatorado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public EmpregadoRefatorado(){}

    void reajustarSalario(Double porcentagemReajuste) {
        Double reajuste = salario * porcentagemReajuste;
        salario += reajuste;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
