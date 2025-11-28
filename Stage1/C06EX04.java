package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C06EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, peso, imc;
        String nome;
        System.out.print("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe sua altura em metros: ");
        altura = teclado.nextDouble();
        System.out.print("Informe seu peso em kg: ");
        peso = teclado.nextDouble();
        imc = peso / (Math.pow(altura,2));
        if (imc < 18)
            System.out.println("Pessoa está desnutrida");
        else if (imc < 20) {
            System.out.println("Pessoa está abaixo do peso");

        } else if (imc > 20 && imc < 25) {
            System.out.println("Pessoa está no peso ideal");

        } else if (imc > 25) {
            System.out.println("Pessoa está acima do peso");

        } else if (imc > 27) {
            System.out.println("Pessoa está obesa");

        }
        teclado.close();


    }
}
