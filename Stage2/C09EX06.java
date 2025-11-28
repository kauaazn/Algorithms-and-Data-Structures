//Autor: Kauã Antônio Reis
package Etapa2;

public class C09EX06 {
    public static void main(String[] args) {
        double serie = 0, num, den;
        for (int aux = 1; aux <= 20; aux++) {
            num = aux;
            den = Math.sqrt(aux * 2);
            serie += num / den;
        }
        serie = 10 + serie;
        System.out.println("Valor da série = " + serie);
    }
}
