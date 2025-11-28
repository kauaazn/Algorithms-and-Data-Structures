//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C09EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double serie = 0, num, den;
        int termos;
        System.out.print("Informe a quantidade de termos: ");
        termos = teclado.nextInt();
        for (int aux = 1; aux <= termos; aux++) {
            num = Math.pow(3, aux + 1);
            den = (aux + 9) * Math.sqrt(Math.pow(aux, 4));
            serie += num / den;
        }
        serie = 100 - Math.pow(serie, 3);
        System.out.println("Valor da série = " + serie);
        teclado.close();
    }
}
