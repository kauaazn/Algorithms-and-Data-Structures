//Autor: Kauã Antônio Reis;
package Etapa2;
import java.util.Scanner;
public class C08EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota, falta, soma=0, rep, faltas16=0, aprov=0;
        double media;
        System.out.print("Quantos alunos serão informados? ");
        rep = teclado.nextInt();
        for (int aluno=1; aluno <=rep; aluno++){
            System.out.print("Informe o valor da nota: ");
            nota = teclado.nextInt();
            if (nota==-1)
                break;
            System.out.print("Informe as faltas: ");
            falta = teclado.nextInt();
            if (nota>=65 && falta<=16){
                System.out.println("Aluno aprovado");
                aprov++;
                soma+=nota;
            }
            else
                System.out.println("Aluno reprovado");
            if (falta > 16)
                faltas16++;

        }
        media = (float)soma/aprov;
        System.out.println("Média das notas dos aprovados = "+media);
        System.out.println("Quantidade de alunos com mais de 16 faltas = "+faltas16);
        teclado.close();

    }
}
