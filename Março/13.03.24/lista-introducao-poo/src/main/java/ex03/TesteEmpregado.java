package ex03;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado01 = new Empregado();
        empregado01.nome = "Jeniffer Lopes";
        empregado01.cargo = "Suporte TI";
        empregado01.salario = 10.0;

        Empregado empregado02 = new Empregado();
        empregado02.nome = "Luis Gustavo";
        empregado02.cargo = "Desempregado/Estagiário";
        empregado02.salario = 0.0;

        Empregado empregado03 = new Empregado();
        empregado03.nome = "João";
        empregado03.cargo = "Analista de SIstemas";
        empregado03.salario = 5400.00;

        empregado03.reajustarSalario(0.15);
        System.out.println("""
                Olá %s que trabalha no cargo %s seu salário foi reajustado para:
                R$ %.2f""".formatted(empregado03.nome, empregado03.cargo, empregado03.salario));

        empregado01.reajustarSalario(0.15);
        System.out.println("""
                Olá %s que trabalha no cargo %s seu salário foi reajustado para:
                R$ %.2f""".formatted(empregado01.nome, empregado01.cargo, empregado01.salario));

    }
}
