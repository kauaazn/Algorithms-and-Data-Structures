package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C05EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, d1, d2, d3, d4, d5;
        System.out.print("Informe o numero de 5 digitos:");
        numero = teclado.nextInt();
        d1 = numero / 10000;
        d2 = numero / 1000 % 10;
        d3 = numero % 1000 / 100;
        d4 = numero / 10 % 10;
        d5 = numero % 10;
        System.out.println("Primeiro número:"+d1+"\n"+"Segundo número:"+d2+"\n"+"Terceiro número:"+d3+"\n"+"Quarto número: "+d4+"\n"+"Quinto número: "+d5);
        teclado.close();





    }
}
