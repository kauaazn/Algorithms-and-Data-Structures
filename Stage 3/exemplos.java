package Etapa3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class exemplos {
    //ordenaçao de lista
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> nomes = new ArrayList<String>();
        String nome = "", sla;

        System.out.print("informe seu nome: ");
        nome = teclado.nextLine();
        while (!nome.equalsIgnoreCase("x")) {
            nomes.add(nome);
            System.out.print("informe seu nome: ");
            nome = teclado.nextLine();
        }

        List<String> ordenados = Teste.ordenarLista(nomes);
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(ordenados.get(i));
        }


        //ordenaçao de vetor
//        String nomes2[] = new String[10];
//
//
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("informe seu nome: ");
//            nomes2[i] = teclado.nextLine();
//        }
//        String ordenada[] = Teste.ordenarVetor(nomes2);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(ordenada[i]);
//        }

        teclado.close();


    }
}


//lista

//List<Double> salarios = new ArrayList<Double>();

//get = pegar
//set = substituir
//add= adicionar
//remove= remover
//clear= limpar


