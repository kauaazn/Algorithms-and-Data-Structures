//Autor: Kauã Antônio Reis
package Etapa2;
import java.util.Scanner;
public class C08EX01 {
    public static void main(String[] args) {
        double area, raio;
        Scanner teclado = new Scanner(System.in);
        for (int circulo=1; circulo<=10; circulo++){
            System.out.print("Informe o valor do raio: ");
            raio = teclado.nextDouble();
            area = 3.1416 * (Math.pow(raio,2));
            System.out.println("Valor da área = "+area);
        }
        teclado.close();
    }
}
