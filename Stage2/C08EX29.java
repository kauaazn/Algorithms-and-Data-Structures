//Autor: Kauã Antônio Reis
package Etapa2;
import java.util.Scanner;
public class C08EX29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, y;
        long resultado = 1;
        System.out.print("Informe o valor de x: ");
        x = teclado.nextInt();
        System.out.print("Informe o valor de y: ");
        y = teclado.nextInt();
        for (int exp = 1; exp<= y; exp++)
            resultado *=x;
        System.out.println(x+ "^" +y+ " = " + resultado);
        teclado.close();
    }
}
