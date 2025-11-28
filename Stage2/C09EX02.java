//Autor: Kauã Antônio Reis;
package Etapa2;

public class C09EX02 {
    public static void main(String[] args) {
        double serie = 0, num, den;
        for (int aux = 1; aux <= 100; aux++) {
            num = aux;
            den = Math.pow(aux, 2) + aux - 1;
            serie += num / den;
        }
        System.out.println("Valor da série = " + serie);

    }
}
