//Autor: Kauã Antônio Reis

import java.util.Scanner;

public class C12ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número para o seu bilhete: ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Informe o numero do bilhete sorteado: ");
        int numSorteado = teclado.nextInt();

        int pos = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numSorteado) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            System.out.println("Parabéns, você ganhou!");
        } else
            System.out.println("Bilhete não encontrado!");

        teclado.close();
    }
}
