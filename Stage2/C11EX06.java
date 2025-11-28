//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C11EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int canal, quantTele, audienciaT=0, canalMassistido=0, contpesquisa=0, cont4=0, cont7=0, cont12=0;

        for(int i=1; i<=5; i++){
            System.out.println("Digite o número do canal: ");
            canal = teclado.nextInt();
            System.out.println("Quantas pessoas estão assistindo: ");
            quantTele = teclado.nextInt();

            if(quantTele==0 || (canal != 4 && canal != 7 && canal != 12)){
                System.out.println("Casa não entra na pesquisa");
            }
            else{
                audienciaT += quantTele;

                switch (canal){
                    case 4:
                        cont4++;
                        break;
                    case 7:
                        cont7++;
                        break;
                    case 12:
                        cont12++;
                        break;
                }

                canalMassistido = canal;
                if( i == 1 || cont7>canalMassistido){
                    canalMassistido = canal;
                } else {
                    canalMassistido = canal;
                }

                contpesquisa++;
            }
        }

        double meida = (float)audienciaT/contpesquisa;


        System.out.println("----------------------------------------------------------------");
        System.out.println("Audiência total: "+audienciaT);
        System.out.println("Porcentagem de audiência para cada canal da pesquisa: ");
        System.out.printf("4: %1.2f", (float)cont4/contpesquisa*100);
        System.out.print("%");
        System.out.printf("\n7: %1.2f", (float)cont7/contpesquisa*100);
        System.out.print("%");
        System.out.printf("\n12: %1.2f", (float)cont12/contpesquisa*100);
        System.out.print("%");
        System.out.println("\nCanal mais assistido: "+canalMassistido);
        System.out.printf("\nMédia de pessoas: %1.2f",meida );







        teclado.close();
    }
}
