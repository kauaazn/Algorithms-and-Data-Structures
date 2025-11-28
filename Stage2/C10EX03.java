//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C10EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double area, raio, angulo;
        System.out.print("Informe o valor do ângulo: ");
        angulo = teclado.nextDouble();
        do {
            System.out.print("Informe o valor do raio ");
            raio = teclado.nextDouble();
            if (raio == -1)
                break;
            area = ((angulo * 3.1416) * Math.pow(raio, 2)) / 360;
            System.out.println("Área = " + area);

        } while (true);
        teclado.close();

    }
}
