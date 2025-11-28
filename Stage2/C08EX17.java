//Autor: Kauã Antônio Reis;
package Etapa2;
import java.util.Scanner;
public class C08EX17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double funcao;
        int soma=0;
        for (int x=3; x<=12; x++){
            funcao = Math.sqrt(Math.pow(x,2)-3);
            System.out.println("f(x)= "+funcao);
            soma+=x;
        }
        teclado.close();
    }
}
