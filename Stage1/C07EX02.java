package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C07EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota1, nota2, nota3;
        System.out.print("Informe a primeira nota: ");
        nota1 = teclado.nextInt();
        System.out.print("Informe a segunda nota: ");
        nota2 = teclado.nextInt();
        System.out.print("Informe a terceira nota: ");
        nota3 = teclado.nextInt();
        int media = (nota1 + nota2 + nota3)/3 ;
        switch (media) {
            case 9: case 10:
                System.out.println("Conceito A");
                break;
            case 8:
                System.out.println("Conceito B");
                break;
            case 7:
                System.out.println("Conceito C");
                break;
            case 5: case 6:
                System.out.println("Conceito D");
                break;
            case 1: case 2: case 3: case 4:
                System.out.println("Conceito E");
                break;
            default:
                System.out.println("Conceito inválido");
                break;

        }
        teclado.close();


    }
}
