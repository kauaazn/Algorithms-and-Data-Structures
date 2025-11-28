package Etapa1;
//Autor:Kauã Antônio Reis
import java.util.Scanner;
public class C05EX04 {
    public static void main(String[] args) {
        double distancia,x1, x2, y1, y2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a coordenada x do ponto 1: ");
        x1 = teclado.nextDouble();
        System.out.print("Informe a coordenada y do ponto 1: ");
        y1 = teclado.nextDouble();
        System.out.print("Informe a coordenada x do ponto 2: ");
        x2 = teclado.nextDouble();
        System.out.print("Informe a coordenada y do ponto 2: ");
        y2 = teclado.nextDouble();
        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 -y2, 2));
        System.out.println("Distancia = "+distancia);
        teclado.close();
    }
}
