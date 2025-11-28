// Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C11EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, funcao, nomeMaior = "", funcaoMaior = "";
        double valorHora, horas, pagamento, premio, maiorSalario = 0;
        double totalFolha = 0, somaHoras = 0;
        int qtdPessoas = 0, faixa1 = 0, faixa2 = 0, faixa3 = 0;

        System.out.print("Informe o valor da hora trabalhada no projeto: ");
        valorHora = teclado.nextDouble();
        teclado.nextLine();

        while (true) {
            System.out.print("ome do trabalhador: ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("FIM")) break;

            System.out.print("Função: ");
            funcao = teclado.nextLine();

            System.out.print("Horas trabalhadas: ");
            horas = teclado.nextDouble();
            teclado.nextLine();

            // Cálculo do prêmio
            if (horas <= 100) {
                premio = 1000;
                faixa1++;
            } else if (horas <= 500) {
                premio = horas * 10;
                faixa2++;
            } else {
                premio = (horas / 10) * 100;
                faixa3++;
            }

            pagamento = (horas * valorHora) + premio;
            somaHoras += horas;
            totalFolha += pagamento;
            qtdPessoas++;

            if (pagamento > maiorSalario) {
                maiorSalario = pagamento;
                nomeMaior = nome;
                funcaoMaior = funcao;
            }

            System.out.println("\n" + nome + " receberá R$ " + pagamento);
        }

        double mediaHoras = somaHoras / qtdPessoas;

        System.out.println("Média de horas trabalhadas: " + mediaHoras);
        System.out.println("Pessoa com maior salário: " + nomeMaior + " (" + funcaoMaior + ")");
        System.out.println("Quantidade por faixa de prêmio:");
        System.out.println("  Até 100h: " + faixa1);
        System.out.println("  De 101 a 500h: " + faixa2);
        System.out.println("  Acima de 500h: " + faixa3);
        System.out.println("Valor total da folha de pagamento: R$ " + totalFolha);

        teclado.close();
    }
}