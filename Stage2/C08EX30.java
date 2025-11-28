//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C08EX30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, n;
        double s = 0;
        System.out.print("Informe o valor de x: ");
        x = teclado.nextInt();
        System.out.print("Informe o valor de n: ");
        n = teclado.nextInt();
        for (int log = 1; log <= n; log++) {
            s = s + (Math.pow(x, log) / log);
        }
        System.out.printf("S = %1.0f", s);
        teclado.close();

    }
}
