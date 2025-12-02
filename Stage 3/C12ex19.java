//Autor: Kauã Antônio Reis
import java.util.Scanner;

public class C12ex19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont=0;
        int num[] = {8,6,2,3,4,5,5,1,9,7};
        int numI[] = new int[num.length];

        for (int i = num.length-1; i>=0; i--){
            numI[cont] = num[i];
            System.out.print(numI[cont]+", ");
            cont++;
        }System.out.print("\b\b");

        teclado.close();
    }
}
