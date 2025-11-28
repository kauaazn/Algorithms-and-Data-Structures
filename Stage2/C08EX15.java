//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C08EX15 {
    public static void main(String[] args) {
        Scanner arquivo = new Scanner(
                C08EX15.class.getResourceAsStream("ficha15.txt"));


        String ana, carlos, fulgencio, maria, roberto, wagner, zulima, aC, cC, fC, mC, rC, wC, zC, nomeMaior="", cargoMaior="";
        double aS, cS, fS, mS, rS, wS, zS, media=0,contM=0, mediaFinal, salarioMaior=0;
        int aI, cI, fI, mI, rI, wI, zI;

        ana = arquivo.nextLine();
        carlos = arquivo.nextLine();
        fulgencio = arquivo.nextLine();
        maria = arquivo.nextLine();
        roberto = arquivo.nextLine();
        wagner = arquivo.nextLine();
        zulima = arquivo.nextLine();
        aC = arquivo.nextLine();
        cC = arquivo.nextLine();
        fC = arquivo.nextLine();
        mC = arquivo.nextLine();
        rC = arquivo.nextLine();
        wC = arquivo.nextLine();
        zC = arquivo.nextLine();
        aS = arquivo.nextDouble();
        cS = arquivo.nextDouble();
        fS = arquivo.nextDouble();
        mS = arquivo.nextDouble();
        rS = arquivo.nextDouble();
        wS = arquivo.nextDouble();
        zS = arquivo.nextDouble();
        aI = arquivo.nextInt();
        cI = arquivo.nextInt();
        fI = arquivo.nextInt();
        mI = arquivo.nextInt();
        rI = arquivo.nextInt();
        wI = arquivo.nextInt();
        zI = arquivo.nextInt();

        String[] nome = {ana, carlos, fulgencio, maria, roberto, wagner, zulima};
        String[] cargo = {aC, cC, fC, mC, rC, wC, zC};
        double[] salario = {aS, cS, fS, mS, rS, wS, zS};
        int[] idade = {aI, cI, fI, mI, rI,wI,zI};

        for (int i = 0; i <=6; i++) {
            if(salario[i]>10000 && idade[i]>50){
                System.out.println(nome[i]+" é um funcionário sênior.");
            }

            if(idade[i]<=18){
                media += salario[i];
                contM++;
            }

            if(i==1 || salario[i]>salarioMaior){
                salarioMaior = salario[i];
                cargoMaior = cargo[i];
                nomeMaior = nome[i];
            }
        }
        mediaFinal = media/contM;

        System.out.printf("Média salarial de funcionários com ate 18 anos: R$%1.2f\nFúncionario de maior salario: "+nomeMaior+" - "+cargoMaior, mediaFinal);




        arquivo.close();
    }
}
