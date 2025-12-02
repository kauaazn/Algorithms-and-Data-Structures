//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;

public class C013ex01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o valo de x1: ");
        int x1 = teclado.nextInt();
        System.out.print("informe o valor de y1: ");
        int y1 = teclado.nextInt();
        System.out.print("informe o valor de x2: ");
        int x2 = teclado.nextInt();
        System.out.print("informe o valor de y2: ");
        int y2 = teclado.nextInt();
        System.out.println(calculo(x1, x2, y1, y2));


        teclado.close();

    }


    static double calculo(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
