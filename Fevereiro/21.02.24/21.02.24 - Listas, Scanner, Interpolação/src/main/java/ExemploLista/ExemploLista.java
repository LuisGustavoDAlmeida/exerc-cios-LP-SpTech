package ExemploLista;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        // Métodos importantes do List
        //
        List listaEstranha = new ArrayList();
        listaEstranha.add(15);
        listaEstranha.add("Nome");
        listaEstranha.add(false);
        listaEstranha.add("Oi");

        System.out.println(listaEstranha);

        List<String> listaDeStrings = new ArrayList<String>(); // Dentro dos diamantes o tipo que a gente
        // passa chama genericType
        listaDeStrings.add ("Lelouch");
        listaDeStrings.add ("15");

        System.out.println(listaDeStrings);

        List<Integer> listaDeInteiros = new ArrayList<Integer>();
        listaDeInteiros.add(15);
        listaDeInteiros.add(-60);
        listaDeInteiros.add(34);
        listaDeInteiros.add(34);

        System.out.println(listaDeInteiros);

//        System.out.println("Entrando no loop de repetição");
//
//        for (int i = 0; i < listaDeStrings.size(); i++) {
//            String nomeAuxiliar = listaDeStrings.get(i);
//            System.out.println(nomeAuxiliar);
//        }
        System.out.println(listaDeStrings.get(1));
        listaDeStrings.remove(1);
        listaDeStrings.remove(0);
        System.out.println(listaDeStrings);

        if (listaDeStrings.isEmpty()) {
            System.out.println("Lista vazia");
        }

        listaDeStrings.add("Okarin");
        listaDeStrings.add("Daru");
        listaDeStrings.add("Kurisu");
        System.out.println("Adicionei novos nomes");
        System.out.println(listaDeStrings);

        System.out.println("Adicionando a Moeka");
        listaDeStrings.add(1, "Moeka"); // Colocando o índice ele "empurra" o que estava ai
        System.out.println(listaDeStrings);

        listaDeStrings.set(1, "Suzuha");
        System.out.println(listaDeStrings);

        listaDeStrings.clear();

        System.out.println(listaDeStrings);
    }
}
