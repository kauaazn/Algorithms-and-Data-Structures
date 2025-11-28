//Autor: Kauã Antônio Reis
package Etapa2;

public class C09EX12 {
    public static void main(String[] args) {
        double pi = 0, num, den, impar, par;
        for (int aux = 1; aux <= 10000; aux++) {
            num = 1;
            den = (aux * 2) - 1;
            if (aux % 2 != 0) {
                pi += num / den;
            } else
                pi -= num / den;
        }
        pi = 4 * pi;
        System.out.println("Valor de π= " + pi);
    }

}


