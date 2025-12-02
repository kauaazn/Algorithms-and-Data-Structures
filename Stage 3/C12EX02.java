//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;

public class C12EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[10];

        // leitura dos 10 números
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            vet[aux] = teclado.nextInt();
        }
        // exibe apenas os valores maiores que 5 e menores que 10
        for (int aux = 0; aux < vet.length; aux++) {
            if (vet[aux] > 5 && vet[aux] < 10) {
                System.out.print(vet[aux] + " ");
            }
        }

        teclado.close();
    }
}