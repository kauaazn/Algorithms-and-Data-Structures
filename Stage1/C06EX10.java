//Autor: Kauã Antônio Reis;
package Etapa1;
import java.util.Scanner;
public class C06EX10 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double capitalApl,numDias,taxaDia, imposto, valorResg,rendimento, taxaDecimal ;
        System.out.print("INFORME O CAPITAL APLICADO: ");
        capitalApl= teclado.nextDouble();
        System.out.print("INFORME O NÚNUROS DE DIAS APLICADO: ");
        numDias= teclado.nextDouble();
        System.out.print("INFORME A TAXA DIÁRIA: ");
        taxaDia= teclado.nextDouble();

        taxaDecimal= taxaDia/100;
        rendimento= capitalApl*taxaDecimal*numDias;
        imposto= rendimento*15/100;
        valorResg= (capitalApl+rendimento)-(imposto)-10;
        System.out.print("Seu valor resgatado é:"+valorResg);
        teclado.close();

    }
}
