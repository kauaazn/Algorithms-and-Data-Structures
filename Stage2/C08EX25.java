//Autor: Kauã Antônio Reis;
package Etapa2;

import java.util.Scanner;

public class C08EX25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int aux3 = 1; aux3 <= 10; aux3++) {
            for (int aux2 = 1; aux2 <= 10; aux2++) {
                for (int aux1 = 1; aux1 <= aux2; aux1++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int aux2 = 10; aux2 >= 1; aux2--) {
                for (int aux1 = 1; aux1 <= aux2; aux1++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        teclado.close();
    }
}