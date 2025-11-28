//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C10EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, peso, mediaH = 0, alturaH = 0;
        int quantidadePessoas = 0, quantidadeMPeso = 0, mulheres = 0, homens = 0;
        String sexo;
        do {
            System.out.print("Informe sua altura em metros: ");
            altura = teclado.nextDouble();
            if (altura == 0)
                break;
            System.out.print("Informe seu peso em Kg: ");
            peso = teclado.nextDouble();
            teclado.nextLine();
            quantidadePessoas++;
            System.out.print("Informe seu sexo (M ou F): ");
            sexo = teclado.nextLine();
            if (sexo.equalsIgnoreCase("M")) {
                alturaH += altura;
                homens++;
            } else if (sexo.equalsIgnoreCase("F")) {
                mulheres++;
                if (peso < 60)
                    quantidadeMPeso++;
            }


        } while (true);
        mediaH = (float) alturaH / homens;
        System.out.println("Altura média dos homens = " + mediaH);
        System.out.println("Total de pessoas: " + quantidadePessoas);
        System.out.println("Quantidade de mulheres: " + mulheres);
        System.out.println("Quantidade de mulheres com peso inferior a 60: " + quantidadeMPeso);


    }
}
