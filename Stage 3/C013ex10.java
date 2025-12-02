//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;

public class C013ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        System.out.println("Informe seu nome: ");
        nome = teclado.nextLine();
        nome = nome.toUpperCase();
        String letras[] = nome.split("");

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
        teclado.close();
    }

}
