//Autor: Kauã Antônio Reis

import java.util.Scanner;

public class C12ex21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = {8, 6, 15, 9, 1, 36, 102, 65, 21, 34, 7, 4, 14, 24, 46, 47, 51, 37, 96, 5};

        for (int i = 0; i < num.length; i += 2) {
            System.out.print(num[i]+", ");
        }
        for (int i = 1; i < num.length; i += 2) {
            System.out.print(num[i]+", ");
        }System.out.println("\b\b");

        teclado.close();
    }
}
