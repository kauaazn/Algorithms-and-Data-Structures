//Autor: Kauã Antônio Reis
package Etapa2;

public class C09EX11F {
    public static void main(String[] args) {
        double serie = 0, num, den;
        for (int aux = 1; aux <= 100; aux++) {
            num = ((aux * 2) - 1) * Math.pow(2, aux + 1);
            den = Math.pow(aux * 5 - 3, 2);
            serie += num / den;
        }
        serie = 5 * Math.sqrt(serie);
        System.out.println("C = " + serie);
    }
}
