//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C11EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numInteiro;

        System.out.println("Digite um número inteiro de 1 a 9: ");
        numInteiro = teclado.nextInt();

        for (int i = 1; i <= numInteiro; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }


        teclado.close();
    }
}
