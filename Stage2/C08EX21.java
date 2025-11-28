//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C08EX21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, imc;
        String situacao;
        System.out.print("Informe sua altura em metros: ");
        altura = teclado.nextDouble();
        //cabeçalho
        System.out.printf("%-10s %-10s %-20s\n", "Peso", "IMC", "Situação Corpórea");
        for (int peso = 60; peso <= 100; peso++) {
            imc = peso / (Math.pow(altura, 2));
            if (imc < 20)
                situacao = "Abaixo do peso";
            else if (imc <= 25) {
                situacao = "Peso ideal";
            } else
                situacao = "Acima do peso";
            //Cada linha da tabela
            System.out.printf("%-10d %-10.2f %-20s\n", peso, imc, situacao);


        }
        teclado.close();

    }
}
