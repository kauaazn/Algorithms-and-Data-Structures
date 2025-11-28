package Etapa1;
//Autor: Kauã Antônio Reis;

import java.util.Scanner;

public class C06EX16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double p1, p2, p3, nTF, nF, idA, faltas, mA, mA2;
        int peso1, peso2;

        System.out.print("Informe a quantidade de faltas: ");
        faltas = teclado.nextDouble();
        System.out.print("Informe a nota da primeira prova:  ");
        p1= teclado.nextDouble();
        System.out.print("Informe a nota da segunda prova:  ");
        p2 = teclado.nextDouble();
        System.out.print("Informe a nota da terceira prova: ");
        p3 = teclado.nextDouble();
        System.out.print("Informe a nota do trabalho final: ");
        nTF = teclado.nextDouble();
        System.out.print("Informe a idade do aluno: ");
        idA = teclado.nextDouble();

/// PESO 1 ////////////////////////////////////////////////////////////////////////
        if (faltas < 5){
            peso1 = 3;
        } else if (faltas >= 5 && faltas <= 10){
            peso1 = 2;
        } else
            peso1 = 1;


/// PESO 2 /////////////////////////////////////////////////////////////////////////
        if(idA<17){
            peso2 = 1;
        } else if (idA>=18 && idA<=50) {
            peso2 = 2;
        } else
            peso2 = 3;



///--------------------------------------------------------------------------------------------------------------------



/// Media A. das melhores notas //////////////////////////////////////////////////////

        if(p1>p2 && p1>p3) {
            if (p2 > p3) {
                mA = (p1 + p2) / 2;
            } else {
                mA = (p1 + p3) / 2;
            }
        } else if (p2>p3 &&  p1>p2) {
            if (p3 > p1) {
                mA = (p1+p2)/2;
            }else {
                mA = (p2+p3)/2;}
        } else {
            if(p1>p2){
                mA = (p1+p3)/2;
            }else  {
                mA = (p3+p2)/2;
            }
        }
///------------------------------------------------------------------------------------------------------------

        nF = mA*peso1 + nTF*peso2;


        if (nF<=50) {
            System.out.print("Aluno Reprovado\nNota final: "+nF);
        } else if (nF>50 && nF<=70) {
            System.out.println("Aluno Regular\nNota final: "+nF);
        } else if (nF>70 && nF<=80) {
            System.out.println("Aluno Bom\nNota final: "+nF);
        } else if (nF>80 && nF<=90) {
            System.out.println("Aluno Muito bom\nNota final: "+nF);
        }else{
            System.out.println("Aluno Excelente\nNota final: "+nF);
        }


        teclado.close();
    }
}
