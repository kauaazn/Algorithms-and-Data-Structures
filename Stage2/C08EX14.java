//Autor: Kauã Antônio Reis;
package Etapa2;

import java.util.Scanner;

public class C08EX14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String simbolo;
        int num;
        System.out.print("Informe um número entre 1 a 20: ");
        num = teclado.nextInt();
        if (num < 1 || num > 20) {
            System.out.println("Número inválido");
            return;
        }
        teclado.nextLine();
        System.out.print("Informe um símbolo: ");
        simbolo = teclado.nextLine();
        for (int aux1 = 1; aux1 <= num; aux1++) {
            for (int aux2 = 1; aux2 <= num; aux2++)
                System.out.print(simbolo + " ");
            System.out.println();
        }
    }

}

