package Etapa2;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C08EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, soma = 0, contimpar = 0, rep, somdiv4=0, div3=0;
        System.out.print("Quantos números serão informados? ");
        rep = teclado.nextInt();
        for (int inteiro = 1; inteiro <=rep; inteiro++){
            System.out.print("Informe um número inteiro: ");
            num = teclado.nextInt();
            if (num % 2 == 0) {
                System.out.println("Número par");
            }
            else {
                System.out.println("Número ímpar");
            }
            if (num%3==0)
                div3++;
            if (num%4==0) {
                soma+=num;
            }

        }
        System.out.println("Números divisíveis por 3: "+div3);
        System.out.println("Soma dos números divisíveis por 4: "+soma);
        teclado.close();


    }
}
