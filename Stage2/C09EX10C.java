//Autor: Kauã Antônio Reis
package Etapa2;

public class C09EX10C {
    public static void main(String[] args) {
        double serie = 0, num, den;
        for (int aux = 1; aux <= 100; aux++) {
            num = (aux * 2) - 1;
            den = aux * 2;
            serie += num / den;
        }
        serie = (1.0 / 3) * Math.pow(serie, 2);
        System.out.println("C = " + serie);
    }
}
