//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C11EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia, pontos, qtd8PrimeiraQuinzena = 0;
        double valorMulta = 0, totalArrecadado = 0;
        String placa;

        while (true) {
            dia = teclado.nextInt();

            if (dia == 99)
                break;

            System.out.print("Informe a placa: ");
            placa = teclado.next();

            System.out.print("Informe os pontos: ");
            pontos = teclado.nextInt();

            // Define o valor da multa conforme os pontos
            if (pontos == 3)
                valorMulta = 42;
            else if (pontos == 5)
                valorMulta = 108;
            else
                valorMulta = 479;


            // Conta multas de 8 pontos na primeira quinzena
            if (pontos == 8 && dia >= 1 && dia <= 15)
                qtd8PrimeiraQuinzena++;

            // Soma total arrecadado
            totalArrecadado += valorMulta;

            // Exibe a multa
            System.out.println("Placa: " + placa);
            System.out.println("Valor da multa: R$" + valorMulta);
        }

        // Resultados finais
        System.out.println("Quantidade de multas de 8 pontos na primeira quinzena: " + qtd8PrimeiraQuinzena);
        System.out.println("Valor total arrecadado com multas: R$" + totalArrecadado);

        teclado.close();
    }
}