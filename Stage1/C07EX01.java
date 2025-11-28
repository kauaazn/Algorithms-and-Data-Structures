package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;

public class C07EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acertos;
        System.out.print("Informe a quantidade de acertos: ");
        acertos = teclado.nextInt();
        switch (acertos) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Nenhum prêmio");
                break;
            case 6: case 7: case 8: case 9: case 10:
                System.out.println("Ganha outro cartão");
                break;
            case 11:
                System.out.println("R$100,00");
                break;
            case 12:
                System.out.println("R$1.000,00");
                break;
            case 13:
                System.out.println("R$50.000,00");
                break;
            default:
                System.out.println("Código de acerto inválido");
                break;
        }
        teclado.close();

    }
}
