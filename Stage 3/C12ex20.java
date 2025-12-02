//Autor: Kauã Antônio Reis

import java.util.Scanner;

public class C12ex20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = {5, 8, 12, 4, 3, 98, 100, 25, 63, 15}, cont = 0, totalnum = 0;


        for (int i = 0; i < num.length; i++) {
            if (num[i] > num[num.length - 1]) {
                System.out.print(num[i] + ", ");
                cont++;
                totalnum = totalnum + num[i];
            }
        }System.out.print("\b\b\n");

        float media = (float) totalnum / cont;
        System.out.println("Média: " + media);


        teclado.close();
    }
}
