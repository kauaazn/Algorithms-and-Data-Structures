//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;

public class C013ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, pesquisa;
        System.out.println("informe o numero inteito: ");
        numero = teclado.nextInt();
        System.out.println("informe a posiçao do numero q vc quer: ");
        pesquisa = teclado.nextInt();
        int posicao = decopo(numero, pesquisa);
        System.out.println(posicao);

        teclado.close();
    }


    private static int decopo(int numDecomp, int pesquisanum) {
        switch (pesquisanum) {
            case 1:
                return numDecomp % 10;

            case 2:
                return numDecomp / 10 % 10;


            case 3:
                return numDecomp / 100 % 10;


            case 4:
                return numDecomp / 1000 % 10;

            case 5:
                return numDecomp / 10000 % 10;

            case 6:
                return numDecomp / 100000 % 10;
            case 7:
                return numDecomp / 1000000 % 10;

            case 8:
                return numDecomp / 10000000 % 10;

            default:
                return numDecomp / 100000000;
        }


    }


}
