//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C08EX20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0, termo = 1, n;
        System.out.print("Informe o valor de n: ");
        n = teclado.nextInt();
        for (int prog = 1; prog <= n; prog++) {
            System.out.println(termo);
            termo *= 2;
            soma += termo;
        }
        System.out.println("Soma = " + soma);
        teclado.close();
    }
}
