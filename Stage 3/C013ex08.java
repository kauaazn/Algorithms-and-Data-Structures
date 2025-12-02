//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;
import java.util.ArrayList;

public class C013ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        System.out.print("informe seu nome: ");
        nome = teclado.nextLine();
        nome = nome.toUpperCase();


        String partes[] = nome.split(" ");
        String lastName = partes[partes.length - 1];

        System.out.print(lastName + ",");
//pegar as primeiras letras de uma frase
        for (int i = 0; i < partes.length - 1; i++) {
            String letras[] = partes[i].split("");
            System.out.print(letras[0] + ".");

        }


        teclado.close();
    }
}
