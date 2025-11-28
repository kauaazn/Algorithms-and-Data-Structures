package Etapa1;
//Autor: Kauã Antônio Reis;

import java.util.Scanner;
public class C06EX14 {
    public static void main(String[] args) {
        int n4d, num1, num2, num3, num4;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero de 4 digitos: ");
        n4d = teclado.nextInt();
        if (n4d>=1000&&n4d<9999) {
            num1 = n4d / 1000;
            num2 = n4d % 1000/100 ;
            num3 = n4d % 100 / 10;
            num4 = n4d % 10;
            System.out.print(num4);
            System.out.print(num3);
            System.out.print(num2);
            System.out.print(num1);
        } else if (n4d != 4) {
            System.out.print("O número tem que ter quatro dígitos. ");
        }
        teclado.close();

    }


}