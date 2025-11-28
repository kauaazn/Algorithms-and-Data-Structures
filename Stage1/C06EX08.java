//Autor: Kauã Antônio Reis;
package Etapa1;
import java.util.Scanner;
public class C06EX08 {
    public static void main(String[] args) {
        String nome;
        double imc, altura, pesoMin,pesoMax;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        nome= teclado.nextLine();
        System.out.print("Informe sua altura: ");
        altura = teclado.nextDouble();
        pesoMin= 20*Math.pow(altura,2.0);
        pesoMax = 25*Math.pow(altura,2.0);
        System.out.print(nome+" Seu peso minimo é: "+pesoMin+", Peso maximo é: "+pesoMax);
        teclado.close();


    }
}
