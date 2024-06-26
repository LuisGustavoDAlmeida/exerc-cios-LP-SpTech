package ex03;

public class Empregado {
    String nome;
    String cargo;
    Double salario = 0.0;

    void reajustarSalario(Double porcentagemReajuste) {
        Double reajuste = salario * porcentagemReajuste;
        salario += reajuste;
    }
}
