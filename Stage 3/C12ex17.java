//Autor: Kauã Antônio Reis

import java.util.Scanner;

public class C12ex17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanhoV = 10, totalint = 0, cont=0;
        int num[] = new int[tamanhoV];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um número inteiro: ");
            num[i] = teclado.nextInt();
        }
        System.out.print("Numeros páres: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + ", ");
                totalint += num[i];
                cont++;
            }
        }
        System.out.println("\b\b");

        float media = (float) totalint / cont;
        System.out.println("Valor eda média: " + media);


        teclado.close();
    }
}
