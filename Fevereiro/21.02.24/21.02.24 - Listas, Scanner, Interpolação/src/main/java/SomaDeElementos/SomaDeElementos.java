package SomaDeElementos;

import java.util.ArrayList;
import java.util.List;

public class SomaDeElementos {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<Integer>();
        Integer somaLista = 0;
        listaNumeros.add(15);
        listaNumeros.add(27);
        listaNumeros.add(33);
        listaNumeros.add(40);
        listaNumeros.add(30);
        listaNumeros.add(78);

        for (int i = 0; i < listaNumeros.size(); i++) {
            somaLista += listaNumeros.get(i);
        }
        System.out.println(somaLista);
    }
}
