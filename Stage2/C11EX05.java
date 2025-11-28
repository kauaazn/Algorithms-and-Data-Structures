//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C11EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int codigo, qtdIngles = 0, qtdAlunos = 0;
        double mensalidade, totalMensalidades = 0, media;
        double totalIngles = 0, totalFrances = 0, totalEspanhol = 0;
        System.out.println("Códigos das línguas:\n1-Inglês\n2-Francês\n3-Espanhol ");

        while (true) {
            System.out.print("Informe o nome: ");
            nome = teclado.nextLine();

            if (nome.equalsIgnoreCase("FIM"))
                break;
            System.out.print("Informe o código da língua: ");
            codigo = teclado.nextInt();
            teclado.nextLine();
            if (codigo == 1) {
                mensalidade = 100;
                qtdIngles++;
                totalIngles += mensalidade;
            } else if (codigo == 2) {
                mensalidade = 150;
                totalFrances += mensalidade;
            } else {
                mensalidade = 120;
                totalEspanhol += mensalidade;
            }


            qtdAlunos++;
            totalMensalidades += mensalidade;

            System.out.println("Aluno: " + nome);
            System.out.println("Mensalidade: R$" + mensalidade);
            System.out.println();
        }

        media = (float)totalMensalidades/qtdAlunos;
        System.out.println("Quantidade de alunos de Inglês: " + qtdIngles);
        System.out.println("Mensalidade média da escola: R$" + media);
        System.out.println("Valor total de mensalidades por língua:");
        System.out.println("Inglês: R$" + totalIngles);
        System.out.println("Francês: R$" + totalFrances);
        System.out.println("Espanhol: R$" + totalEspanhol);

        teclado.close();
    }
}