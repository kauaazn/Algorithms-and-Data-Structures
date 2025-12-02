//Autor: Kauã Antônio Reis
import java.util.Scanner;

public class C12ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomes[] = new String[50], nomeM[] = new String[3];
        int notas[] = new int[50], notaM[] = new int[3], notasM1=0;


        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = teclado.nextLine();
            System.out.print("Digite a nota do aluno: ");
            notas[i] = teclado.nextInt();
            teclado.nextLine();
        }

        for (int i = 0; i < nomes.length; i++) {
            if (i == 0 || notas[i] >= notasM1) {
                notasM1 = notas[i];
                notaM[i] = notas[i];
                nomeM[i] = nomes[i];
            }
        }

        System.out.println("Alunos com maior nota:  ");
        for (int i = 0; i < nomes.length; i++) {
            if (notaM[i] != 0 )
                System.out.println(nomeM[i] + " - "+ notaM[i]);
        }



        teclado.close();
    }

}
