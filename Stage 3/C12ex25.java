//Autor: Kauã Antônio Reis
import java.util.Scanner;

public class C12ex25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = "Eu sou torcedor do galão da massa";
        String palavras[] = frase.split(" ");
        for (int aux=0; aux<palavras.length; aux++)
            System.out.println(palavras[aux]);



        teclado.close();
    }
}
