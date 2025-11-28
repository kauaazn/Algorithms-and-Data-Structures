package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C06EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, fx;
        System.out.print("Informe o valor de x:");
        x = teclado.nextDouble();
        if (x<4)
            fx = (5*x +3)/ (Math.sqrt(16-Math.pow(x,2)));
        else
            if (x==4)
                fx = 0;
            else
                    fx = (5*x+3)/Math.sqrt(Math.pow(x,2)-16);
    System.out.printf("Valor de f(x): %6.4f",fx);
        teclado.close();


    }
}
