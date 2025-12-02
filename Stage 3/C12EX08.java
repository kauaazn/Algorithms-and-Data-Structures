//Autor: Kauã Antônio Reis;
package Etapa3;

import java.util.Scanner;

public class C12EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //vetores
        int numeros[] = new int[20];
        int soma[] = new int[10];

        //lê os números
        for (int aux = 0; aux < numeros.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            numeros[aux] = teclado.nextInt();
        }

        //lê a soma
        for (int aux = 0; aux < soma.length; aux++) {
            soma[aux] = numeros[aux] + numeros[aux + 10];
        }

        //imprime a soma intercalada
        for (int aux = 0; aux < soma.length; aux++) {
            System.out.println("Soma " + (aux + 1) + "=" + soma[aux]);
        }
        teclado.close();


    }
}
