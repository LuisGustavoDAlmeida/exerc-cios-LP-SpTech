import java.util.List;

public class ExemploMetodo {
    // Retorno: void (não tem)
    // Nome: apresentarUsuario
    // Argumentos: nome que é uma String
    // Corpo tudo que fica dentro das
    // Tudo isso acima se chama assinatura do método
    void apresentarUsuario(String nome) {
        System.out.println("""
                Olá %s""".formatted(nome));

        // Método com retorno:
        // A taxa é de 20% do valor da venda, caso o produto custe menos de 500
        // Acima de 500.00, o valor de taxa é de 40%
    }

    // Um método com retorno precisa de um retorno
    // Ele não aceita dois ifs, porque existe a possibilidade de não haver um retorno
    // Utilizando uma variável somente para o retorno é melhor, assim não é obrigatório o uso do else
    // Além de ser mais organizado
    Double calcularTaxa (Double valorVenda) {
        Double valorTaxa;
        if (valorVenda <= 500.0) {
            valorTaxa = valorVenda * 0.2;
        } else  {
            valorTaxa = valorVenda * 0.4;
        }
        return valorTaxa;
    }

    // Efeito da sobrecarga
    void apresentarUsuario(String nome, String sobrenome) {
        System.out.println("""
                Olá %s %s""".formatted(nome, sobrenome));
    }

    void exibirNomes(List<String> nomes) {
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i));
        }
    }

}
