//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;

public class

C013ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String sobrenome;
        String nomes[] = new String[5];
        int cont = 0;


        System.out.print("inofrme um sobremone");
        sobrenome = teclado.nextLine();
        sobrenome = sobrenome.trim();


        for (int i = 0; i < nomes.length; i++) {
            System.out.print("informe seu nome completo");
            nomes[i] = teclado.nextLine();
            nomes[i] = nomes[i].trim();
        }
        for (int i = 0; i < nomes.length; i++) {
            String partes[] = nomes[i].split(" ");
            String ultimonome = partes[partes.length - 1];
            ultimonome = ultimonome.trim();
            if (sobrenome.equalsIgnoreCase(ultimonome)) {
                cont++;
            }
        }
        System.out.println("Essas pessoas podem pertecer a familia " + cont);

        teclado.close();


    }
}
