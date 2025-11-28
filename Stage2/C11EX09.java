// Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C11EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, setor = "", primeiroFuncionario = "", ultimoFuncionario = "";
        String rf;
        int qtdGerencia = 0, qtdAdm = 0, qtdPsq = 0, qtdObras = 0;
        int qtd2010Adm = 0;
        int totalFuncionarios = 0;

        while (true) {
            System.out.print("Informe o nome do funcionário: ");
            nome = teclado.nextLine();

            if (nome.equalsIgnoreCase("FIM"))
                break;

            System.out.print("Informe o registro funcional (6 dígitos): ");
            rf = teclado.nextLine();

            // Validação do RF
            if (rf.length() != 6) {
                System.out.println("REGISTRO INVÁLIDO (tamanho incorreto)");
                System.out.println();
                continue;
            }

            int ano = Integer.parseInt(rf.substring(0, 2)); // dois primeiros dígitos
            int setorCodigo = Character.getNumericValue(rf.charAt(2)); // terceiro dígito

            int anoCompleto = 2000 + ano;

            if (anoCompleto < 2010 || anoCompleto > 2014) {
                System.out.println("REGISTRO INVÁLIDO (ano fora da faixa 2010-2014)");
                System.out.println();
                continue;
            }

            switch (setorCodigo) {
                case 1:
                    setor = "Gerência";
                    qtdGerencia++;
                    break;
                case 2:
                    setor = "Administração";
                    qtdAdm++;
                    if (anoCompleto == 2010)
                        qtd2010Adm++;
                    break;
                case 3:
                    setor = "Pesquisa";
                    qtdPsq++;
                    break;
                case 4:
                    setor = "Obras";
                    qtdObras++;
                    break;
                default:
                    System.out.println("REGISTRO INVÁLIDO (setor inexistente)");
                    System.out.println();
                    continue;
            }

            totalFuncionarios++;

            // Primeiro e último funcionário admitidos
            if (totalFuncionarios == 1) {
                primeiroFuncionario = nome;
            }
            ultimoFuncionario = nome;

            System.out.println("Funcionário válido: " + nome + " | Setor: " + setor + " | Ano de admissão: " + anoCompleto);
        }

        // Identificar o setor com mais funcionários
        String setorMaisFuncionarios = "Gerência";
        int maior = qtdGerencia;

        if (qtdAdm > maior) {
            maior = qtdAdm;
            setorMaisFuncionarios = "Administração";
        }
        if (qtdPsq > maior) {
            maior = qtdPsq;
            setorMaisFuncionarios = "Pesquisa";
        }
        if (qtdObras > maior) {
            maior = qtdObras;
            setorMaisFuncionarios = "Obras";
        }

        System.out.println("Gerência: " + qtdGerencia);
        System.out.println("Administração: " + qtdAdm);
        System.out.println("Pesquisa: " + qtdPsq);
        System.out.println("Obras: " + qtdObras);
        System.out.println("Funcionários de 2010 na Administração: " + qtd2010Adm);
        System.out.println("Setor com mais funcionários: " + setorMaisFuncionarios);
        System.out.println("Primeiro funcionário ativo: " + primeiroFuncionario);
        System.out.println("Último funcionário ativo: " + ultimoFuncionario);

        teclado.close();
    }
}