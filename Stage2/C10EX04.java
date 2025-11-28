//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C10EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precoFinal, bdi, taxaBdi, custoTotal = 0, custoParcial, preco;
        int quantidade;
        String nome;
        System.out.print("Informe a taxa de BDI em %: ");
        taxaBdi = teclado.nextDouble();
        teclado.nextLine();
        do {
            System.out.print("Informe o nome do material: ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("FIM"))
                break;
            System.out.print("Informe a quantidade do material: ");
            quantidade = teclado.nextInt();
            System.out.print("Informe o preço unitário: ");
            preco = teclado.nextDouble();
            teclado.nextLine();
            custoParcial = quantidade * preco;
            System.out.printf("Nome do produto: %s%n", nome);
            System.out.printf("Custo parcial: R$ %.2f%n", custoParcial);
            custoTotal += custoParcial;
        } while (true);
        bdi = custoTotal * taxaBdi / 100;

        precoFinal = custoTotal + bdi;
        System.out.printf("Custo total = R$ %.2f%n", custoTotal);
        System.out.printf("Valor do BDI (%.2f%%) = R$ %.2f%n", taxaBdi, bdi);
        System.out.printf("Preço final do produto = R$ %.2f%n", precoFinal);
        teclado.close();
    }
}
