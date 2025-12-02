//Autor: Kauã Antônio Reis;
package Etapa3;

import java.util.Scanner;

public class C12EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[10], cont = 0;
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            vet[aux] = teclado.nextInt();
            if (vet[aux] % 5 == 0 && vet[aux] % 7 == 0) {
                cont++;
            }
        }
        System.out.println("Quantidade de dividsores de 5 e 7 ao mesmo tempo: " + cont);
        teclado.close();

    }
}
