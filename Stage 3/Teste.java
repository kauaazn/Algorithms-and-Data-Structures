package Etapa3;

import java.util.List;

public class Teste {
    public static String[] ordenarVetor(String[] nomes) {
        String temp;

        for (int aux = 0; aux < nomes.length - 1; aux++) {

            for (int i = 0; i < nomes.length - 1; i++) {

                if (nomes[i].compareToIgnoreCase(nomes[i + 1]) > 0) {
                    temp = nomes[i];
                    nomes[i] = nomes[i + 1];
                    nomes[i + 1] = temp;

                }
            }
        }
        return nomes;
    }

    public static List<String> ordenarLista(List<String> nomes) {
        String temp;
        for (int aux = 0; aux < nomes.size() - 1; aux++) {
            for (int i = 0; i < nomes.size() - 1; i++) {

                if (nomes.get(i).compareToIgnoreCase(nomes.get(i + 1)) > 0) {
                    temp = nomes.get(i);
                    nomes.set(i, nomes.get(i + 1));
                    nomes.set(i + 1, temp);

                }
            }
        }
        return nomes;
    }

}