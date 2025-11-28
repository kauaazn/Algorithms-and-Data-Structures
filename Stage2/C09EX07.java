//Autor: Kauã Antônio Reis
package Etapa2;

public class C09EX07 {
    public static void main(String[] args) {
        double serie = 0, num, den;
        for (int aux = 1; aux <= 6; aux++) {
            num = (aux - 1) * 2 + aux * 3;
            den = (aux * 6) + 1;
            serie += num / den;
        }
        System.out.println("Valor da série = " + serie);
    }
}
