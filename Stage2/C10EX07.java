//Autor: Kauã Antônio Reis
package Etapa2;
import java.util.Scanner;
public class C10EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anos, meses, dia = 0, dias, resto;
        double populacao, taxa, contaminados = 1;
        System.out.print("Informe a população: ");
        populacao = teclado.nextDouble();
        do {
            taxa = 0.003;
            contaminados = contaminados + contaminados * taxa;
            dia++;
            if (contaminados>=populacao)
                break;
        }while (true);
        anos = dia / 365;
        resto = dia % 365;
        meses = resto / 30;
        dias = resto % 30;
        System.out.println("Anos = "+anos);
        System.out.println("Meses = "+meses);
        System.out.println("Dias = "+dias);
        teclado.close();
    }
}
