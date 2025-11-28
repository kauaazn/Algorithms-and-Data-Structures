package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C05EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        System.out.print("Informe o valor da nota 1:");
        nota1 = teclado.nextDouble();
        System.out.print("Informe o valor da nota 2:");
        nota2 = teclado.nextDouble();
        System.out.print("Informe o valor da nota 3:");
        nota3 = teclado.nextDouble();
        media = (nota1*2 + nota2*3 + nota3*5)/10;
        System.out.println("Média: "+media);
        teclado.close();

    }
}
