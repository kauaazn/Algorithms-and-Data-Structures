//Autor: Kauã Antônio Reis;
package Etapa2;

import java.util.Scanner;

public class C09EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double serie = 0, num, den;
        int termos;
        System.out.print("Informe a quantidade de termos: ");
        termos = teclado.nextInt();
        for (int aux = 1; aux <= termos; aux++) {
            num = ((aux * 4) - 3) * ((aux * 4) - 2);
            den = ((aux * 4) - 1) * (aux * 4);
            serie += num / den;
        }
        serie = Math.sqrt(serie);
        System.out.println("Valor da série: " + serie);
        teclado.close();

    }
}
