//Autor: Kauã Antônio Reis;
package Etapa2;

import java.util.Scanner;

public class C10EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media, valor, multa = 0;
        int cont = 0, soma = 0;
        do {
            System.out.print("Informe o valor da multa = ");
            valor = teclado.nextDouble();
            if (valor == -1)
                break;
            multa = valor * 0.1;
            System.out.println("Valor da multa = " + multa);
            cont++;
            soma += valor * 0.1;
        }
        while (true);
        media = (float) soma / cont;
        System.out.println("Média = " + media);
        teclado.close();


    }
}
