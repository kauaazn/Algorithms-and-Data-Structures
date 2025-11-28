//Autor: Kauã Antônio Reis;
package Etapa2;
import java.util.Scanner;
public class C08EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota, falta, ap = 0, rep = 0;
        for (int aluno = 1; aluno <= 50; aluno++) {
            System.out.print("Informe o valor da nota: ");
            nota = teclado.nextInt();
            if (nota == -1)
                break;
            System.out.print("Informe as faltas: ");
            falta = teclado.nextInt();
            if (nota >= 65 && falta <= 16) {
                System.out.println("Aluno aprovado");
                ap++;
            } else {
                System.out.println("Aluno reprovado");
                rep++;
            }
        }
        System.out.println("Quantidade de alunos aprovados: " + ap);
        System.out.println("Quantidade de alunos reprovados: " + rep);
        teclado.close();

    }
}
