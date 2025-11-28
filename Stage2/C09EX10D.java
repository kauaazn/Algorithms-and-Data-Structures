//Autor: Kauã Antônio Reis
package Etapa2;

public class C09EX10D {
    public static void main(String[] args) {
        double serie = 0, num, den;
        for (int aux = 1; aux <= 100; aux++) {
            num = aux + (aux - 1);
            den = Math.pow(aux, 2);
            serie += num / den;
        }
        System.out.println("D = " + serie);
    }
}
