package Etapa1;
import java.util.Scanner;
//Autor: Kauã Antônio Reis
public class C05EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, d1, d2, d3;

        System.out.print("Escreva o número do cheque do banco: ");
        num = teclado.nextInt();
        d1 = num / 1000000;
        d2 = num / 1000 % 1000;
        d3 = num % 1000;

        System.out.printf("Banco: "+d1+"\nAgência: "+d2+"\nSequencial: "+d3);



        teclado.close();
    }
}