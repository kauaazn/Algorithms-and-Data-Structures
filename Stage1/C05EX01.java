package Etapa1;
//Kauã Antônio Reis
import java.util.Scanner;
public class C05EX01 {
    public static void main(String[] args) {
        double x, fx;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor de x: ");
        x = teclado.nextDouble();
        fx = Math.pow(x,3) + 4 * x + 10;
        System.out.println("Informe o valor de f(x) = "+fx);
        teclado.close();
    }
}
