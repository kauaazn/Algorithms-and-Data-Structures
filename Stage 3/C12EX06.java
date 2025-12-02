//Autor: Kauã Antônio Reis;
package Etapa3;

import java.util.Scanner;

public class C12EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //vetor para armazenar os dados
        String vet[] = new String[12];

        //lê os nomes em ordem
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.print("Mês " + (aux + 1) + ": ");
            vet[aux] = teclado.nextLine();
        }

        //imprime em ordem inversa
        for (int aux = 11; aux < vet.length; aux--) {
            System.out.println(vet[aux]);
        }
        teclado.close();


    }
}
