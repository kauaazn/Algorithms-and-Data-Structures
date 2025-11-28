//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C08EX19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0, metodo;
        for (int prog = 1; prog <= 100; prog++) {
            metodo = prog * prog;
            System.out.println(metodo);
            soma += metodo;
        }
        System.out.println("Soma = " + soma);
        teclado.close();
    }
}
