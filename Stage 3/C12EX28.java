//Autor: Kauã Antônio Reis;
package Etapa3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class C12EX28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, ra;

        //listas dinmicas
        List<String> listaNomes = new ArrayList<String>();
        List<String> listaRa = new ArrayList<String>();

        //le as listas dinamicas
        do {
            System.out.print("Informe o nome do aluno: ");
            nome = teclado.nextLine();
            System.out.print("Informe o RA do aluno");
            ra = teclado.nextLine();
            listaNomes.add(nome);
            listaRa.add(ra);
        }while (!nome.equalsIgnoreCase("X"));

        //ordenaçao em ordem alfabetica
        for (int aux = 0; aux < listaNomes.size()-1; aux++){
            for (int aux1 = aux+1; aux1 < listaNomes.size(); aux1++){
                if (listaNomes.get(aux).compareToIgnoreCase(listaNomes.get(aux1))>0){
                    //Troca o nome
                    String tempNome = listaNomes.get(aux);
                    listaNomes.set(aux, listaNomes.get(aux1));
                    listaNomes.set(aux1, tempNome);

                    // Troca o RA correspondente
                    String tempRa = listaRa.get(aux);
                    listaRa.set(aux, listaRa.get(aux1));
                    listaRa.set(aux1, tempRa);
                }
            }
        }





    }
}
