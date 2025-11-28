//Autor: Kauã Antônio Reis;
package Etapa2;

import java.util.Scanner;

public class C09EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double serie = 0, num, den;
        int termos;
        System.out.print("Informe a quantidade de termos: ");
        termos = teclado.nextInt();
        for (int aux = 1; aux <= termos; aux++) {
            num = 1 + Math.sqrt(aux * 4);
            den = aux * 3;
            serie += num / den;
        }
        System.out.println("Valor da série = " + serie);
        teclado.close();

    }
}
