//Autor: Kauã Antônio Reis
import java.util.Scanner;

public class C12ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomes[] = new String[50], nomeM="";
        int notas[] = new int[50], notaM=0;




        for (int i = 0; i< nomes.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = teclado.nextLine();
            System.out.print("Digite a nota do aluno: ");
            notas[i] = teclado.nextInt();
            teclado.nextLine();
        }

        for(int i = 0; i < nomes.length; i++) {
            if( i==0 || notas[i] > notaM) {
                notaM = notas[i];
                nomeM = nomes[i];
            }
        }

        System.out.println("Aluno com maior nota:  " + nomeM + " - "+notaM + " pontos");


        teclado.close();
    }
}
