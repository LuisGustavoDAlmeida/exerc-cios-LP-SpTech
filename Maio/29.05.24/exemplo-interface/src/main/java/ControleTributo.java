import java.util.ArrayList;
import java.util.List;

public class ControleTributo {
    private List<Tributavel> listaTributaveis;

    public ControleTributo() {
        this.listaTributaveis = new ArrayList<>();
    }

    public void adicionarTributavel(Tributavel itemTributavel){
        listaTributaveis.add(itemTributavel);
    }


}
