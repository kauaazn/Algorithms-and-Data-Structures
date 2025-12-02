//Autor: Kauã Antônio Reis

import java.util.Scanner;

public class C12ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.println("Meses do ano: ");
        for (int i = 0; i < meses.length; i++) {
            System.out.print(meses[i] + ", ");
        }
        System.out.print("\b\b");


        int cont = meses.length - 1; // ou cont=vet.lenght-1;
        String temp;
        for (int aux = 0; aux < cont; aux++) {
            for (int x = 0; x < cont; x++)
                if (meses[x].compareToIgnoreCase(meses[x + 1]) > 0) {
                    temp = meses[x];
                    meses[x] = meses[x + 1];
                    meses[x + 1] = temp;
                }
            cont--;
        }

        System.out.println("\nMeses do ano em ordem alfabética: ");
        for (int i = 0; i < meses.length; i++) {
            System.out.print(meses[i] + ", ");
        }
        System.out.print("\b\b");


        teclado.close();
    }
}
