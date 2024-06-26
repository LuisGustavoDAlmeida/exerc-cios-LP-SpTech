import java.util.ArrayList;
import java.util.List;

public class RelatorioMetodos {
    Integer buscarQuantidadeVendas(List<Double> precos) {
        return precos.size();
    }

    Double somarVendas(List<Double> precos) {
        Double soma = 0.0;
        for (int i = 0; i < precos.size(); i++) {
            soma += precos.get(i);
        }
        return soma;
    }

    Boolean buscarPreco(List<Double> precos, Double precoPesquisa) {
        Boolean precoNaLista = false;
        for (int i = 0; i < precos.size(); i++) {
            if (precoPesquisa.equals(precos.get(i))) {
                precoNaLista = true;
                break;
            } else {
                precoNaLista = false;
            }
        }
        return precoNaLista;
    }

    Double buscarMaiorPreco(List<Double> precos) {
        Double maiorPreco = precos.get(0);
        for (int i = 0; i < precos.size(); i++) {
            if (maiorPreco < precos.get(i)) {
                maiorPreco = precos.get(i);
            }
        }
        return maiorPreco;
    }
    
    Double buscarMenorPreco(List<Double> precos) {
        Double menorPreco = precos.get(0);
        for (int i = 0; i < precos.size(); i++) {
            if (menorPreco > precos.get(i)) {
                menorPreco = precos.get(i);
            }
        }
        return menorPreco;
    }

    List<Double> buscarPorPrecoMinimo(List<Double> precos, Double precoFiltro) {
        List<Double> precosNovos = new ArrayList<Double>();
        for (int i = 0; i < precos.size(); i++) {
            if (precos.get(i) >= precoFiltro){
                precosNovos.add(precos.get(i));
            }
        }
        return precosNovos;
    }
}
