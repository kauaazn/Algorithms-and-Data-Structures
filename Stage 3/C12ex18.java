//Autor: Kauã Antônio Reis
import java.util.Scanner;

public class C12ex18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanhoV = 10;
        int num[] = new int[tamanhoV];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um número inteiro: ");
            num[i] = teclado.nextInt();
        }

        System.out.println("Digite um número real: ");
        float numReal = teclado.nextFloat();

        System.out.print("Números multiplicados: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]*numReal+" ,");
        }System.out.println("\b\b");


        teclado.close();
    }
}
