//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C08EX22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, divisor = 0;
        System.out.print("Informe um número inteiro maior que 0: ");
        num = teclado.nextInt();
        //testa todos os divisores de 1 até o numero
        for (int primo = 1; primo <= num; primo++) {
            if (num % primo == 0)
                divisor++;
        }
        //testa se o número é divisível por 1 e ele mesmo
        if (divisor == 2)
            System.out.println("O número é primo");
        else
            System.out.println("O número não é primo");
        teclado.close();

    }
}
