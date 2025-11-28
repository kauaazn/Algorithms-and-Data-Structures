package Etapa1;
import java.util.Scanner;
//Autor: Kauã Antônio Reis

public class C05EX12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, seg, segV, h, m;

        System.out.print("Escreva os segundos desejados: ");
        seg = teclado.nextInt();

        n1 = seg / 60;
        segV = seg % 60;
        h = n1 / 60;
        m = n1 % 60;

        System.out.printf(h + ":" + m + ":" + segV);


        teclado.close();
    }
}
