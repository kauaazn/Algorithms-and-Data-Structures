//Autor: Kauã Antônio Reis;
package Etapa2;
import java.util.Scanner;
public class C08EX16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media;
        int soma=0, impar=0;
        for (int numero=1000; numero<=2000; numero++){
            if (numero%2!=0) {
                impar++;
                soma += numero;
            }
        }
        media = (float) soma/impar;
        System.out.println("A média dos números ímpares é: "+media);
        teclado.close();
        }
    }

