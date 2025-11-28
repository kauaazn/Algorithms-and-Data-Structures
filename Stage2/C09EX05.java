//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C09EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double serie = 0, num, den;
        int termos;
        System.out.print("Informe a quantidade de termos: ");
        termos = teclado.nextInt();
        for (int aux = 1; aux <= termos; aux++) {
            num = (aux - 1) * 2 + aux * 3;
            den = (aux * 6) + 1;
            serie += num / den;
        }
        serie = 5 * serie;
        System.out.println("Valor da série = " + serie);
        teclado.close();

    }
}
