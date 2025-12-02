//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class C12EX26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double salario, indice;

        //Lista dinâmicas sincronizadas
        List<String> listaNomes = new ArrayList<String>();
        List<Double> listaSalarios = new ArrayList <Double>();

        //Leitura das listas
        do {
            System.out.print("Informe seu nome (x para encerrar): ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                System.out.print("Informe o salário de " + nome + ": ");
                salario = teclado.nextDouble();
                teclado.nextLine();
                listaNomes.add(nome);
                listaSalarios.add(salario);
            }

        } while (!nome.equalsIgnoreCase("X"));

        //Pede o reajuste
        System.out.print("Informe o índice de reajuste salarial: ");
        indice = teclado.nextDouble();

        //Imprime sincronizado as 2 listas
        for (int aux = 0; aux < listaNomes.size(); aux++) {
            double salarioAtual = listaSalarios.get(aux);
            if (salarioAtual < 1000) {
                salarioAtual += salarioAtual * (indice / 100);
                listaSalarios.set(aux, salarioAtual);
            }
            System.out.println(listaNomes.get(aux) + " – R$ " + String.format("%.2f", listaSalarios.get(aux)));
        }
        teclado.close();


    }
}
