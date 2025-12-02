//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;

public class C12EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[20];

        // Leitura da ordem de chegada da primeira bateria
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.print("Posição " + (aux + 1) + ": ");
            vet[aux] = teclado.nextInt();
        }

        // Montagem e exibição das duplas
        for (int aux = 0; aux < vet.length; aux++) {
            int corredor1 = vet[aux];      // Posição i + 1
            int corredor2 = vet[aux + 10]; // Posição i + 11
            System.out.println("Dupla " + (aux + 1) + ": " + corredor1 + " / " + corredor2);
        }

        teclado.close();
    }
}
