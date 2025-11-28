//Autor: Kauã Antônio Reis
package Etapa2;
import java.util.Scanner;

public class C08EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double media, preco, custoparcial, custoMaior = 0, custoTotal = 0;
        String nome, nomeMaior = "";
        int insumos, quantidade;

        System.out.print("Quantos insumos serão utilizados: ");
        insumos = teclado.nextInt();
        teclado.nextLine();

        for (int i = 1; i <= insumos; i++) {
            System.out.print("Informe o nome do insumo: ");
            nome = teclado.nextLine();

            System.out.print("Informe a quantidade de insumos: ");
            quantidade = teclado.nextInt();

            System.out.print("Informe o preço do produto: ");
            preco = teclado.nextDouble();
            teclado.nextLine();

            custoparcial = quantidade * preco;
            custoTotal += custoparcial;

            if (custoparcial > custoMaior) {
                custoMaior = custoparcial;
                nomeMaior = nome;
            }
        }

        media = custoTotal / insumos;

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("A média dos custos é: R$ " + media);
        System.out.println("O custo total do projeto é: R$ " + custoTotal);
        System.out.println("O insumo de maior custo parcial: " + nomeMaior + " (R$ " + custoMaior + ")");

        teclado.close();
    }
}