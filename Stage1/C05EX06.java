package Etapa1;
//Autor: Kauã Antônio Reis
import java.util.Scanner;
public class C05EX06 {
    public static void main(String[] args) {
        double A, B, C, x, y, distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor de A da reta R:");
        A = teclado.nextDouble();
        System.out.print("Informe o valor de B da reta R:");
        B = teclado.nextDouble();
        System.out.print("Informe o valor de C da reta R:");
        C = teclado.nextDouble();
        System.out.print("Informe o valor de x do ponto P:");
        x = teclado.nextDouble();
        System.out.print("Informe o valor de y do ponto P:");
        y = teclado.nextDouble();
        distancia = ( A* x + B * y + C) / Math.sqrt(Math.pow(A,2)+Math.pow(B,2));
        System.out.println("Valor da distância: "+distancia);
        teclado.close();

    }
}
