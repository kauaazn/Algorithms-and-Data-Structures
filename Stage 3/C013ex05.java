//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;

public class C013ex05 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int angulo;
        double angrad, cosseno, seno, tangente;
        System.out.print("informe o angulo para calculo: ");
        angulo=teclado.nextInt();
        angrad=angulo*(Math.PI/180);
        cosseno =Math.cos(angrad);
        tangente =Math.tan(angrad);
        seno=Math.sin(angrad);

        System.out.println("cosseno "+(1/cosseno));
        System.out.println("tangente "+(1/tangente));
        System.out.println("seno "+(1/seno));



         teclado.close();
    }

}
