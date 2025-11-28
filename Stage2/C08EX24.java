//Autor: Kauã Antônio Reis;
package Etapa2;

import java.util.Scanner;

public class C08EX24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double serie = 0;
        for (int aux = 1; aux <= 99; aux += 2) {
            serie = (Math.pow(2, aux));
        }
        serie = (1.0 / 3) * serie;
        System.out.println("Valor da série = " + serie);
        teclado.close();
    }
}
