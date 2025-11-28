//Autor: Kauã Antônio Reis;
package Etapa2;

import java.util.Scanner;

public class C08EX27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int aux3 = 1; aux3 <= 10; aux3++) {
            //faz a sequencia multiplicando por 2 cada *
            for (int aux2 = 1; aux2 <= 128; aux2 *= 2) {
                for (int aux1 = 1; aux1 <= aux2; aux1++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            //quebra a sequencia ate 128 dividindo por 2, refazendo a sequencia inversa
            for (int aux2 = 128 / 2; aux2 >= 1; aux2 /= 2) {
                for (int aux1 = 1; aux1 <= aux2; aux1++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        teclado.close();
    }
}
