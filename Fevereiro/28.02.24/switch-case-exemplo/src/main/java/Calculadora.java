public class Calculadora {

    // OS MÉTODOS PRECISAM SER VERBOS
    Integer somar (Integer valor1, Integer valor2) { // "void" é a indicação do método que não recebe retorno
        // "exibirTexto / somar" é o nome do método
        // O "String nome / Integer valor1/valor2" é um argumento e é opcional
        if(valor1 != null && valor2 != null){
            return valor1 + valor2;
        } else {
            return 0;
        } // Ele precisa retornar algo, se não tiver o else não é possível compilar
        // Um método com retorno, precisa retornar algum valor
    }

    Integer somar (Integer valor1, Integer valor2, Integer valor3){ // A assinatura do método a 1° linha é diferente
        // do outro método de soma, o Java entende que eles possuem o mesmo nome, mas eles executam
        // de forma diferente, afinal esse somar tem 3 valores
        // Isso é sobrecarregar, ter o mesmo método, indo além mais de uma vez

        return (valor1 + valor2) + valor3; // Dessa maneira você pega o retorno do primeiro somar
        // e soma com o 3° valor do outro somar
    }

    Double somar(Double valor1, Double valor2) {
        return valor1+valor2;
    }

    Integer subtrair (Integer valor1, Integer valor2){
        return valor1 - valor2;
    }

    Integer multiplicar (Integer valor1, Integer valor2) {
        return valor1 * valor2;
    }

    Double multiplicar2 (Double valor1, Integer valor2) {
        return valor1 * valor2;
    }

    Double multiplicar2 (Integer valor1, Double valor2) {
        return valor1 * valor2 ; // Nesse caso a sobrecarga não funcionará para o multiplicar 2 acima
        // devido ao fato da ordem da declaração das variáveis serem diferentes
    }
}
