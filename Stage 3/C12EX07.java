//Autor: Kauã Antônio Reis;
package Etapa3;

import java.util.Scanner;

public class C12EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String conceito;

        //vetores
        int notas[] = new int[50];
        String nomes[] = new String[50];

        //lê os nomes e as notas
        for (int aux = 0; aux < 50; aux++) {
            System.out.print("Aluno " + (aux + 1) + ": ");
            nomes[aux] = teclado.nextLine();
            System.out.print("Nota final: ");
            notas[aux] = teclado.nextInt();
            teclado.nextLine();
        }

        //Verifica e imprime o conceito pela nota final
        for (int aux = 0; aux < 50; aux++) {
            if (notas[aux] <= 30)
                conceito = "D";
            else if (notas[aux] <= 60) {
                conceito = "C";
            } else if (notas[aux] <= 80) {
                conceito = "B";
            } else
                conceito = "A";
            System.out.println(nomes[aux] + "Conceito: " + conceito);


        }
        teclado.close();


    }
}
