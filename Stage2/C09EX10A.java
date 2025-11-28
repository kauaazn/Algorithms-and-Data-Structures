//Autor: Kauã Antônio Reis
package Etapa2;

public class C09EX10A {
    public static void main(String[] args) {
        double serie = 0, num, den;
        for (int aux = 1; aux <= 100; aux++) {
            num = aux;
            den = Math.sqrt(aux * 2);
            serie += num / den;
        }
        System.out.println("A = " + serie);
    }
}
