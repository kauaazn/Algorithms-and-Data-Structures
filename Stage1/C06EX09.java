//Autor: Kauã Antônio Reis;
package Etapa1;
import java.util.Scanner;
public class C06EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String sexo;
        double altura, pesoIdealm, pesoIdealh;
        System.out.print("Informe seu sexo: ");
        sexo= teclado.nextLine();
        System.out.print("Informe sua altura: ");
        altura= teclado.nextDouble();
        if (sexo.equals("m")||sexo.equals("feminino")) {
            pesoIdealm= (62.1*altura)-44.7;
            System.out.printf("%2.3f",pesoIdealm);
        } else if (sexo.equals("h")||sexo.equals("masculino")) {
            pesoIdealh = (72.7*altura)-58;
            System.out.printf("%2.3f",pesoIdealh);
            teclado.close();

        }
    }

}

