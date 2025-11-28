//Autor: Kauã Antônio Reis;
package Etapa2;

import java.util.Scanner;

public class C11EX13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double serie = 0, num, den, i = 0;
        int termos;
        System.out.print("Informe a quantidade de termos: ");
        termos = teclado.nextInt();

        while (i<=termos) {
            num = i * Math.pow((i * 9) + 1, i * 2);
            den = Math.pow(7, i - 1);
            serie += num / den;
            i++;

        }
        serie = 71 + Math.cbrt(serie);
        System.out.println("Série = "+serie);

        teclado.close();


    }
}
