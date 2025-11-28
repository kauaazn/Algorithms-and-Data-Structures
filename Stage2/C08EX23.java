//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C08EX23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media;
        int soma = 0, cont = 0;
        for (int num = 1000; num <= 9999; num++) {
            int dig1 = num / 1000;
            int dig2 = num / 100 % 10;
            int dig3 = num / 10 % 10;
            int dig4 = num % 10;
            if (dig1 == dig4 && dig2 == dig3) {
                System.out.println(num);
                soma += num;
                cont++;
            }
        }
        media = (float) soma / cont;
        System.out.println("Média= " + media);
        teclado.close();


    }
}
