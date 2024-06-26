public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Josel", 8.0, 9.0);
        System.out.println(aluno);

        System.out.println("Exibindo nota final");
        System.out.println(aluno.calcularNotaFinal());

        AlunoPos alunoPos = new AlunoPos("Luis", 3.1, 4.0, 1.5);
        System.out.println(alunoPos);

        System.out.println("Exibindo nota final");
        System.out.println(alunoPos.calcularNotaFinal());

    }
}
