//Autor: Kauã Antônio Reis;
package Etapa2;

import java.util.Scanner;

public class C11EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double funcao, soma = 0, media;
        int cont = 0, rep;
        System.out.print("Informe um número: ");
        rep = teclado.nextInt();
        for (int aux = 1; aux <= rep; aux++) {
            if (aux % 2 != 0) {
                funcao = Math.pow(aux, 2) + ((4 * aux) - 2) / 5.0;
                System.out.println("f(x) = " + funcao);
                soma += funcao;
                cont++;


            }


        }
        media = (float) soma / cont;
        System.out.println("Média f(x) = " + media);
        teclado.close();
    }
}