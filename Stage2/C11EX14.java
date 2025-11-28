//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C11EX14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double somaDaSerie=0, seriePI = 0, num, den, termo=0;
        long i=0;
        while ( !(seriePI > 3.1416 && seriePI < 3.1417) ) {

            num = 1;
            den = i*2 + 1 ;


            if (i%2==0) {
                termo = num / den;
            }
            else {
                termo = (num*-1) / den;
            }
            somaDaSerie += termo;
            seriePI = 4*somaDaSerie;
            i++;
            if (i > 500_000) {
                break;
            }
        }

        System.out.print("Termos necessários: " + i);

        teclado.close();

    }
}