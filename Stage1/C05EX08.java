package Etapa1;
//Autor: Kauã Antônio Reis
import java.util.Scanner;
public class C05EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio, angulo, area;
        System.out.print("Informe o valor da área: ");
        area = teclado.nextDouble();
        System.out.print("Informe o valor do ângulo: ");
        angulo = teclado.nextDouble();
        raio = Math.sqrt((360*area)/angulo*(1/3.1416));
        System.out.println("Valor do raio:"+raio);
        teclado.close();
    }
}
