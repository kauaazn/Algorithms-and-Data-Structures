//Autor: Kauã Antônio Reis;
package Etapa1;

import java.util.Scanner;
public class C06EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int  setsEq1, setsEq2, vencedor, perdedor ;
        String equipe1str, equipe2str;
        System.out.print("Digite o nome da equipe1: ");
        equipe1str= teclado.nextLine();
        System.out.print("Digite o nome da equipe2: ");
        equipe2str= teclado.nextLine();
        System.out.print("Quantos sets a equipe 1 ganhou?: ");
        setsEq1= teclado.nextInt();
        System.out.print("Quantos sets a equipe 2 ganhou?:");
        setsEq2=teclado.nextInt();
//        double equipe1 =Double.parseDouble(equipe1str);
//        double equipe2 =Double.parseDouble(equipe2str);


        if (setsEq1==3&&setsEq2==2) {
            vencedor=2;
            perdedor=1;
            System.out.print("pontos "+equipe1str+" = "+vencedor +"pontos "+equipe2str+" = "+perdedor);
        } else if (setsEq2==3&&setsEq1==2) {
            vencedor=2;
            perdedor=1;
            System.out.print("pontos "+equipe1str+" = "+perdedor +"pontos "+equipe2str+" = "+vencedor);
        }
        else if (setsEq1==3&&setsEq2<=1){
            vencedor=3;
            System.out.print("pontos "+equipe1str+" = "+vencedor+" pontos "+equipe2str+ " = 0");
        } else if (setsEq2==3&&setsEq1<=1) {
            vencedor=3;
            System.out.print("pontos "+equipe2str+" = "+vencedor);
            teclado.close();
        }

    }
}

