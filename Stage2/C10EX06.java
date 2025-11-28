//Autor: Kauã Antônio Reis
package Etapa2;

import java.lang.classfile.instruction.DiscontinuedInstruction;
import java.util.Scanner;

public class C10EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, distancia, x, y;
        System.out.print("Informe o valor de a: ");
        a = teclado.nextDouble();
        System.out.print("Informe o valor de b: ");
        b = teclado.nextDouble();
        System.out.print("Informe o valor de c: ");
        c = teclado.nextDouble();
        do {
            System.out.print("Informe o valor de xo: ");
            x = teclado.nextDouble();
            System.out.print("Informe o valor de yo: ");
            y = teclado.nextDouble();
            distancia = ((a * x) + (b * y) + c) / Math.sqrt((Math.pow(a, 2)) + Math.pow(b, 2));
            System.out.println("D = " + distancia);


        } while (distancia != 0);
        teclado.close();


    }
}
