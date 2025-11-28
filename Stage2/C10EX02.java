//Autor: Kauã Antônio Reis;
package Etapa2;

import java.util.Scanner;

public class C10EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media, valor, valortotal, soma = 0;
        int cont = 0, quantidade = 0;
        do {
            System.out.print("Informe os valores recebidos: ");
            valor = teclado.nextDouble();
            if (valor == 0)
                break;
            cont++;
            soma += valor;
            if (valor > 1000.00)
                quantidade++;
        } while (true);
        valortotal = soma;
        System.out.println("Valor total recebido: " + valortotal);
        System.out.println("Quantidade de valores acima de R$1000.00 = " + quantidade);
        media = (float) soma / cont;
        System.out.println("Média = " + media);
        teclado.close();

    }
}
