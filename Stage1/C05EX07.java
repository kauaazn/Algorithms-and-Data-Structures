package Etapa1;
//Autor: Kauã Antônio Reis
import java.util.Scanner;
public class C05EX07 {
    public static void main(String[] args) {
        double x, funcao;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor de x:");
        x = teclado.nextDouble();
        funcao = Math.sqrt(Math.pow(x/4+1,2)+(1/5.0)*x);
        System.out.println("Valor de f(x): "+funcao);
        teclado.close();


    }
}
