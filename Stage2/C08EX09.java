//Autor: Kauã Antônio Reis
package Etapa2;
import java.util.Scanner;

public class C08EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, sexo;
        double mediaM, mediaH;
        int rep, somaM = 0, somaH = 0, idade, contM = 0, contH = 0;

        System.out.print("Quantas pessoas serão informadas? ");
        rep = teclado.nextInt();

        for (int pessoa = 1; pessoa <= rep; pessoa++) {
            teclado.nextLine(); // consumir quebra de linha
            System.out.print("Informe o nome da pessoa: ");
            nome = teclado.nextLine();
            System.out.print("Informe a idade da pessoa: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Informe o sexo da pessoa (M/F): ");
            sexo = teclado.nextLine();

            if (sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("f")) {
                contM++;
                somaM += idade;
            } else if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")) {
                contH++;
                somaH += idade;
            }
        }

        mediaM = (double) somaM / contM;
        System.out.println("Média de idade das mulheres = "+mediaM);
        mediaH = (double) somaH / contH;
        System.out.println("Média de idade dos homens = "+mediaH);
        teclado.close();
    }
}