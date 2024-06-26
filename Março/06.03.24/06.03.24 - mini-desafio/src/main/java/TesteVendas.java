import java.util.ArrayList;
import java.util.List;

public class TesteVendas {
    public static void main(String[] args) {
        RelatorioMetodos relatorioMetodos = new RelatorioMetodos();
        List<Double> precos = new ArrayList<Double>();

        precos.add(25.0);
        precos.add(33.0);
        precos.add(157.0);
        precos.add(333.2);
        precos.add(13.2);
        precos.add(18.7);
        precos.add(19.5);
        precos.add(21.4);
        precos.add(22.8);
        precos.add(30.5);

        System.out.println(relatorioMetodos.buscarQuantidadeVendas(precos));
        System.out.println(relatorioMetodos.somarVendas(precos));
        Double precoPesquisa = 25.0;
        System.out.println(relatorioMetodos.buscarPreco(precos, precoPesquisa));
        System.out.println(relatorioMetodos.buscarMaiorPreco(precos));
        System.out.println(relatorioMetodos.buscarMenorPreco(precos));
        Double precoFiltro = 157.0;
        System.out.println(relatorioMetodos.buscarPorPrecoMinimo(precos, precoFiltro));

    }
}
