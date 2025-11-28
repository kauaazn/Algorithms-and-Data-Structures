package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;

public class C07EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diasAtraso;
        double imposto;
        System.out.print("Informe os dias de atraso:");
        diasAtraso = teclado.nextInt();
        System.out.print("Informe o valor do imposto: R$ ");
        imposto = teclado.nextDouble();
        switch (diasAtraso) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Isento de multa");
                break;
            case 6: case 7: case 8:
                System.out.println("Multa de R$ "+(imposto*0.02));
                break;
            case 9: case 10:
                System.out.println("Multa de R$ "+(imposto*0.1+(imposto*0.005*diasAtraso)));
                break;
            default:
                System.out.println("Multa de R$ "+(imposto*1.5+(1*diasAtraso)));
                break;
        }
        teclado.close();
    }

}
