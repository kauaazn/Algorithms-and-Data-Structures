//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;

public class C12EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[10];
        int soma = 0;

        // Leitura dos 10 valores e cálculo da soma
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o número inteiro: ");
            vet[i] = teclado.nextInt();
            soma += vet[i];
        }



        // Verificação dos divisores da soma
        System.out.print("Números impressos: ");
        for(int i=0; i< vet.length; i++){
            if(soma%vet[i]==0) {
                System.out.print(vet[i] + " ");
            }
        }

        teclado.close();
    }
}