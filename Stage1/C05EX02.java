package Etapa1;
//Kauã Antônio Reis
import java.util.Scanner;
public class C05EX02 {
    public static void main(String[] args) {
        double area, raio, volume;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor do raio: ");
        raio = teclado.nextDouble();
        area = 4 * 3.1416 * Math.pow(raio,2);
        volume = (4 / 3.0) * 3.1416 * Math.pow(raio,3);
        System.out.println("area = "+area);
        System.out.println("volume = + "+volume);
        teclado.close();
    }
}
