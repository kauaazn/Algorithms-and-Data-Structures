//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;

public class C013ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        double fx;
        System.out.println("informe o valor de x: ");
        x = teclado.nextInt();
        fx = calcfx(x);
        System.out.println(fx);

        teclado.close();
    }

    private static double calcfx (double x) {

        if (x < 4) {
            return (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2));
        } else if (x == 4) {
            return 0;
        } else {
            return (5 * x + 3.0) / Math.sqrt(Math.pow(x, 2) - 16);
        }

    }

}
