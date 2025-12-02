//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class C12EX27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cpf, endereco;

        // Listas dinâmicas sincronizadas para armazenar CPFs e seus endereços
        List<String> listaCPFs = new ArrayList<String>();
        List<String> listaEnderecos = new ArrayList<String>();

        // ===== ETAPA 1: Cadastro inicial =====
        do {
            System.out.print("Informe o CPF (0 para encerrar): ");
            cpf = teclado.nextLine(); // Lê o CPF digitado

            // Se o CPF não for "0", lê e adiciona o endereço correspondente
            if (!cpf.equals("0")) {
                System.out.print("Informe o endereço do CPF " + cpf + ": ");
                endereco = teclado.nextLine();

                // Adiciona CPF e endereço nas listas (mesma posição)
                listaCPFs.add(cpf);
                listaEnderecos.add(endereco);
            }

        } while (!cpf.equals("0")); // Encerra quando o CPF for "0"

        // ===== ETAPA 2: Pesquisa e alteração/exclusão =====
        System.out.print("Informe um CPF para pesquisa: ");
        String cpfPesquisa = teclado.nextLine(); // CPF que será pesquisado

        // Procura o índice do CPF na lista
        int indice = listaCPFs.indexOf(cpfPesquisa);

        // Se encontrou o CPF
        if (indice != -1) {
            System.out.println("CPF encontrado!");
            System.out.print("Deseja alterar o endereço (A) ou excluir o CPF/endereço (E)? ");
            String opcao = teclado.nextLine();

            // Alterar o endereço
            if (opcao.equalsIgnoreCase("A")) {
                System.out.print("Informe o novo endereço: ");
                String novoEndereco = teclado.nextLine();
                listaEnderecos.set(indice, novoEndereco); // Atualiza o endereço
                System.out.println("Endereço atualizado com sucesso!");
            }
            // Excluir CPF e endereço
            else if (opcao.equalsIgnoreCase("E")) {
                listaCPFs.remove(indice);
                listaEnderecos.remove(indice);
                System.out.println("CPF e endereço removidos com sucesso!");
            }
        }
        // Se o CPF não foi encontrado
        else {
            System.out.println("CPF não encontrado.");
            System.out.print("Deseja incluir este CPF? (S/N): ");
            String incluir = teclado.nextLine();

            // Se o usuário quiser incluir o CPF
            if (incluir.equalsIgnoreCase("S")) {
                System.out.print("Informe o endereço: ");
                String novoEndereco = teclado.nextLine();
                listaCPFs.add(cpfPesquisa); // Adiciona novo CPF
                listaEnderecos.add(novoEndereco); // Adiciona o novo endereço correspondente
                System.out.println("Novo CPF e endereço adicionados com sucesso!");
            }
        }

        // ===== ETAPA 3: Impressão final das listas =====
        for (int aux = 0; aux < listaCPFs.size(); aux++) {
            // Exibe cada CPF com seu respectivo endereço
            System.out.println(listaCPFs.get(aux) + " – " + listaEnderecos.get(aux));
        }

        teclado.close();
    }
}