//Autor: Kauã Antônio Reis;
package Etapa2;
import java.util.Scanner;
public class C08EX18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long multiplicacao=1;
        int num;
        System.out.print("Informe um número inteiro de 1 a 9: ");
        num = teclado.nextInt();
        for (int numero=1; numero<=9; numero++){
            multiplicacao = num*numero;
            System.out.println(numero+ "X" +num+ "=" +multiplicacao);
        }
        teclado.close();
    }
}
