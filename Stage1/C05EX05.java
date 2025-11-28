package Etapa1;
//Autor:Kauã Antônio Reis
import java.util.Scanner;
public class C05EX05 {
    public static void main(String[] args) {
        double celsius, fahrenheit, kelvin;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a temperatura em celsius: ");
        celsius = teclado.nextDouble();
        kelvin = 273 + celsius;
        fahrenheit = (celsius * 9+160)/5;
        System.out.println("Valor em kelvin: "+kelvin);
        System.out.println("Valor em fahrenheit: "+fahrenheit);
        teclado.close();

    }
}
