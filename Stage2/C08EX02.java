//Autor: Kauã Antônio Reis;
package Etapa2;
import java.util.Scanner;
public class C08EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota, falta;
        for (int aluno=1; aluno <=50; aluno++){
            System.out.print("Informe o valor da nota: ");
            nota = teclado.nextInt();
            if (nota==-1)
                break;
            System.out.print("Informe as faltas: ");
            falta = teclado.nextInt();
            if (nota>=65 && falta<=16)
                System.out.println("Aluno aprovado");
            else
                System.out.println("Aluno reprovado");
        }
        teclado.close();
    }
}
