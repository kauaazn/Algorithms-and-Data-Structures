//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;

public class C013ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frase;

        System.out.println("Imforme a frase: ");
        frase = teclado.nextLine();

        frase = frase.toLowerCase();
        String partes[] = frase.split(" ");


        for (int i = 0; i < partes.length; i++) {
            String letras[] = partes[i].split("");
            letras[0] = letras[0].toUpperCase();
            for (int i2 = 0; i2 < letras.length; i2++) {
                System.out.print(letras[i2]);
            }
            System.out.print(" ");
        }


        teclado.close();
    }
}
