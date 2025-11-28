//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C08EX12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo;
        double modelo1=0, contM1=0, modelo2=0, contM2=0, modelo3=0, contM3=0, modelo4=0, contM4=0, modelo5=0, contM5=0;
        double faturamento;


        for(int i=1; i<=100; i++){

            System.out.println("Informe o código do produto: ");
            codigo = teclado.nextInt();


            switch(codigo){
                case 1:
                    modelo1+=1565;
                    contM1++;
                    break;
                case 2:
                    modelo2+=1890;
                    contM2++;
                    break;
                case 3:
                    modelo3+=2150;
                    contM3++;
                    break;
                case 4:
                    modelo4+=2963;
                    contM4++;
                    break;
                case 5:
                    modelo5+=3750;
                    contM5++;
                    break;
            }
        }

        faturamento=(modelo1*contM1)+(modelo2*contM2)+(modelo3*contM3)+(modelo4*contM4)+(modelo5*contM5);
        System.out.println("Faturamento: "+faturamento);

        teclado.close();
    }
}
