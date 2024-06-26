package mini.desafio;

import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {
    Double valorUsuario = 0.0;
    Boolean cofreQuebrado = false;
    String meta;
    Double valorCofrinho = 0.0;

    void depositar (Double valorDepositado) {
        if (cofreQuebrado == true) {
            System.out.println("Seu cofrinho está quebrado");
        } else {
            valorCofrinho += valorDepositado;
        }
    }
    Double agitarCofrinho () {
        Double valorAgitado;
        if (cofreQuebrado == true) {
            System.out.println("Seu cofrinho está quebrado");
            return null;
        } else {
            valorAgitado = ThreadLocalRandom.current().nextDouble(0, valorCofrinho);
            Double novoValor  = valorCofrinho - valorAgitado;
        }
        return valorAgitado;
    }
    void quebrarCofrinho() {
        if (cofreQuebrado == false) {
            valorUsuario = valorCofrinho;
            valorCofrinho = 0.0;
        } else {
            System.out.println("Seu cofrinho já está quebrado");
        }
    }
}
