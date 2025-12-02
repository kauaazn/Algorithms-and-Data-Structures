//Autor: Kauã Antônio Reis

import java.util.Scanner;


public class C12ex24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamV = 20, pontucaoF[] = new int[tamV];
        String nome[] = new String[tamV];
        for (int i = 0; i < tamV; i++) {
            System.out.print("Digite o nome do time: ");
            nome[i] = teclado.nextLine();
            System.out.print("Digite o valor da pontuação final do time: ");
            pontucaoF[i] = teclado.nextInt();
            teclado.nextLine();
        }

        //Deixar em ordem decrescente por pontução (inteiro)
        int tempNota = 0;
        String tempNome = "";
        for (int aux = 0; aux < pontucaoF.length - 1; aux++) {
            for (int x = 0; x < pontucaoF.length - 1; x++)
                if (pontucaoF[x] < pontucaoF[x + 1]) {
                    tempNota = pontucaoF[x];
                    nome[x] = nome[x + 1];
                    pontucaoF[x + 1] = tempNota;
                    tempNome = nome[x];
                    nome[x] = nome[x + 1];
                    nome[x + 1] = tempNome;
                }
        }

        System.out.println("Digite o nome de uma equipe: ");
        String equipe = teclado.nextLine();
        int pos = -1;
        for (int i = 0; i < tamV; i++)
            if (nome[i].equalsIgnoreCase(equipe) ) {
                pos = i;
                break;
            }

        if (pos>0 && pos<=4) {
            System.out.println("A equipe está na Copa Libertadores");
        }else if (pos>=5 && pos<=12) {
            System.out.println("A equipe está na Copa Sul-americana");
        }else
            System.out.println("Equipe foi rebaixada");


        teclado.close();
    }
}
