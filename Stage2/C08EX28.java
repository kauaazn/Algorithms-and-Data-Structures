//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C08EX28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media;
        //soma acumula os números triangulares e cont conta quantos foram encontrados
        int soma = 0, cont = 0;
        for (int triangular = 1; triangular <= 1000; triangular++) {
            for (int inteiro = 1; inteiro <= triangular; inteiro++) {
                //Se um triangular é o produto de tres inteiros consecutivos, sera inteiro * inteiro+1 * inteiro+2
                if (triangular == inteiro * (inteiro + 1) * (inteiro + 2)) {
                    System.out.println(+triangular);
                    soma += triangular;
                    cont++;
                }
            }
        }
        media = (float) soma / cont;
        System.out.println("Média = " + media);
        teclado.close();
    }
}
