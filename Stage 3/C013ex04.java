//Autor: Kauã Antônio Reis
package Etapa3;

import java.util.Scanner;


public class C013ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int segredo=random();
        System.out.println("chute umnumero de 1 a 100: ");
        numero = teclado.nextInt();

        while (numero != segredo) {
            System.out.println("chute umnumero de 1 a 100: ");
            numero = teclado.nextInt();
            if (numero > segredo) {
                System.out.println("chutou muito forte, tente diminuir um pouco");
            } else if (numero < segredo) {
                System.out.println("chutou muito fraco, tente novamnte");

            } else {
                System.out.println("acertou");
            }
        }


        teclado.close();
    }


    private static int random() {
        return (int) (Math.random() * 100);
    }
}
