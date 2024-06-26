package RemocaoDeElementos;

import java.util.ArrayList;
import java.util.List;

public class RemocaoDeElementos {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(15);
        listaNumeros.add(27);
        listaNumeros.add(33);
        listaNumeros.add(40);
        listaNumeros.add(30);
        listaNumeros.add(78);


        for (int i = listaNumeros.size() - 1; i >= 0; i--) {
            Integer resto = listaNumeros.get(i) % 2;
            if (resto == 0) {
                listaNumeros.remove(i);
            }
        }
        System.out.println(listaNumeros);
    }
}
