//Autor: Kauã Antônio Reis;
package Etapa2;

public class C09EX01 {
    public static void main(String[] args) {
        double serie = 0, den, num;
        for (int aux = 1; aux <= 37; aux++) {
            num = (38 - aux) * (39 - aux);
            den = aux;
            serie += num / den;
        }
        System.out.println("Valor da série = " + serie);

    }
}
