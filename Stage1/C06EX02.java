package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C06EX02 {
    public static void main(String[] args) {
        double quantPol, valorMulta;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a quantidade de poluentes: ");
        quantPol = teclado.nextDouble();
        if (quantPol <= 1500)
            valorMulta = 0;
        else
            if (quantPol <= 3500)
                valorMulta = 3000;
            else
                valorMulta = 5000 * quantPol;
        System.out.println("Valor da multa = R$:"+valorMulta);
        teclado.close();


    }
}
