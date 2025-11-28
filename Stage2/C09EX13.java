//Autor: Kauã Antônio Reis
package Etapa2;

public class C09EX13 {
    public static void main(String[] args) {
        double serie = 0, den, num;
        for (int aux = 1; aux <= 10; aux++) {
            num = 1;
            for (int aux2 = 1; aux2 <= aux; aux2++) {
                num *= aux2;
            }
            den = Math.pow(2, aux) - 1;
            if (aux % 2 != 0)
                serie += num / den;
            else
                serie -= num / den;
        }
        System.out.println("Série = " +serie);

    }
}
