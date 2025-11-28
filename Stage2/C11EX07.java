//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C11EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double temp, menorTemp=0, maiorTemp=0, media, contMtemp=0, tempT=0,contM=0;


        for (int i=1;i<=121;i++){
            System.out.println("Qual a temperatura: ");
            temp = teclado.nextDouble();

            if(i == 1 || temp < menorTemp){
                menorTemp = temp;
            }

            if(i == 1 || temp > maiorTemp){
                maiorTemp = temp;
                contMtemp++;
            }
            contM++;
            tempT+=temp;
        }

        media = tempT/contM;

        System.out.println("Menor temperatura registrada: "+menorTemp);
        System.out.println("Maior temperatura registrada: "+maiorTemp);
        System.out.println("Média de temperaturas registradas: "+media);
        System.out.println("Quantidade de dias com maior temperatura: "+contMtemp);




        teclado.close();
    }
}