package ex01;

public class Bolo {
    String sabor;
    Double valor;
    Integer qtdVendida;

    void comprarBolo(Integer qtdBolo) {
        Integer preCompra = qtdVendida + qtdBolo;

        // qtdVendida = preCompra > 100 ? 0 : preCompra;

        if (preCompra > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo");
        } else {
            qtdVendida += qtdBolo;
        }
    }
    void exibirRelatorio() {
        System.out.println("""
                O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f""".formatted(sabor,
                qtdVendida, (valor * qtdVendida)));
    }

}
