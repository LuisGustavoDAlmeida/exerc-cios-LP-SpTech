package ex04;

public class Termometro {
    Integer temperaturaAtual;
    Integer temperaturaMax;
    Integer temperaturaMin;
    void aumentaTemperatura(Integer temperaturaAumentada) {
        Integer novaTemperatura = temperaturaAtual + temperaturaAumentada;
        if (novaTemperatura > temperaturaMax) {
            temperaturaAtual = temperaturaMax;
        } else {
            temperaturaAtual = novaTemperatura;
        }
    }
    void diminuiTemperatura (Integer temperaturaDiminuida) {
        Integer novaTemperatura = temperaturaAtual - temperaturaDiminuida;
        if (novaTemperatura < temperaturaMin) {
            temperaturaAtual = temperaturaMin;
        } else {
            temperaturaAtual = novaTemperatura;
        }
    }
    void exibeFahreinheit() {
        Integer temperaturaFahreinheit = (temperaturaAtual * 9/5) + 32;
        System.out.println("""
                A temperatura em Fahreinheit é: %d""".formatted(temperaturaFahreinheit));
    }
}
