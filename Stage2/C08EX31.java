//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C08EX31 {

    public static void main(String[] args) {
        Scanner arquivo = new Scanner(
                C08EX31.class.getResourceAsStream("ficha31.txt"));

        String ana, carlos, fulgencio, maria, roberto, wagner, zulima, aC, cC, fC, mC, rC, wC, zC, nomeMenor = "", cargoMenor = "";
        double aS, cS, fS, mS, rS, wS, zS, salariosADM = 0, salarioMenor = 0;
        int contSM = 0, contAdm = 0, contOutros = 0;

        ana = arquivo.nextLine();
        carlos = arquivo.nextLine();
        fulgencio = arquivo.nextLine();
        maria = arquivo.nextLine();
        roberto = arquivo.nextLine();
        wagner = arquivo.nextLine();
        zulima = arquivo.nextLine();
        aC = arquivo.nextLine();
        cC = arquivo.nextLine();
        fC = arquivo.nextLine();
        mC = arquivo.nextLine();
        rC = arquivo.nextLine();
        wC = arquivo.nextLine();
        zC = arquivo.nextLine();
        aS = arquivo.nextDouble();
        cS = arquivo.nextDouble();
        fS = arquivo.nextDouble();
        mS = arquivo.nextDouble();
        rS = arquivo.nextDouble();
        wS = arquivo.nextDouble();
        zS = arquivo.nextDouble();

        String[] nome = {ana, carlos, fulgencio, maria, roberto, wagner, zulima};
        String[] codigo = {aC, cC, fC, mC, rC, wC, zC};
        double[] salario = {aS, cS, fS, mS, rS, wS, zS};

        for (int i = 0; i < 7; i++) {
/// Todos os engenheiros que recebem menos que o salário mínimo, sem contar outros
            if (codigo[i].equalsIgnoreCase("C")) {
                if (salario[i] < 2500) {
                    System.out.println(nome[i] + " - " + codigo[i] + " - R$" + salario[i] + " - ABAIXO DO SALÁRIO MÍNIMO");
                }
            } else if (codigo[i].equalsIgnoreCase("P")) {
                if (salario[i] < 4650) {
                    System.out.println(nome[i] + " - " + codigo[i] + " - R$" + salario[i] + " - ABAIXO DO SALÁRIO MÍNIMO");
                }
            } else if (codigo[i].equalsIgnoreCase("O")) {
                if (salario[i] < 3200) {
                    System.out.println(nome[i] + " - " + codigo[i] + " - R$" + salario[i] + " - ABAIXO DO SALÁRIO MÍNIMO");
                }
            } else if (codigo[i].equalsIgnoreCase("A")) {
                if (salario[i] < 5100) {
                    System.out.println(nome[i] + " - " + codigo[i] + " - R$" + salario[i] + " - ABAIXO DO SALÁRIO MÍNIMO");
                }
            }

/// Quantidade de engenheiros que recebem igual ou a mais que o salario mínimo, sem contar "outros"
            if (codigo[i].equalsIgnoreCase("C")) {
                if (salario[i] >= 2500) {
                    contSM++;
                }
            } else if (codigo[i].equalsIgnoreCase("P")) {
                if (salario[i] >= 4650) {
                    contSM++;
                }
            } else if (codigo[i].equalsIgnoreCase("O")) {
                if (salario[i] >= 3200) {
                    contSM++;
                }
            } else if (codigo[i].equalsIgnoreCase("A")) {
                if (salario[i] >= 5100) {
                    contSM++;
                }
            }
/// Todos aqueles que sao engenheiros ADM
            if (codigo[i].equalsIgnoreCase("A")) {
                contAdm++;
                salariosADM += salario[i];
            }
/// Todos os engenherios "outros" que recebem mais que 5000
            if (codigo[i].equalsIgnoreCase("X")) {
                if (salario[i] > 5000) {
                    contOutros++;
                }
            }
/// Menor salario entre os engenheiros
            if (i == 1 || salario[i] < salarioMenor) {
                salarioMenor = salario[i];
                nomeMenor = nome[i];
                cargoMenor = codigo[i];
            }
        }



        double mediaADM = (float) salariosADM / contAdm;

        System.out.println("Quantidade de Engenheiros que recebem igual ou a mais que o salário mínimo: " + contSM);
        System.out.printf("Média salarial dos ADM´s: R$%1.2f \n", mediaADM);
        System.out.println("Quantidade de engenheiros 'outros' que recebem mais que R$5000,00: " + contOutros);
        System.out.println(nomeMenor + " - " + cargoMenor + " - R$" + salarioMenor + " - Recebe o menor salário dentro os outros.");

        arquivo.close();
    }
}
