//Autor: Kauã Antônio Reis

import java.util.Scanner;

public class C12ex23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vetor1[] = {8, 6, 2, 3, 4, 12, 5, 1, 9, 7};
        int vetor2[] = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 3 == 0) {
                vetor2[i] = vetor1[i];
            }
        }

        for (int i = 0; i < vetor2.length; i++) {
            if (vetor2[i] > 0)
                System.out.print(vetor2[i] + ", ");
        }
        System.out.println("\b\b");


        teclado.close();
    }
}
