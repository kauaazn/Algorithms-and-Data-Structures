//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;

public class C013ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe, seu nome: ");
        String nome = teclado.nextLine();

        String partes[] = nome.split(" ");
        String ultimonome = partes[partes.length - 1];
        System.out.println("ultimo nome "+ultimonome);


        teclado.close();
    }
}
