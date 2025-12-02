//Autor: Kauã Antônio Reis
import java.util.Scanner;

public class C12ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomes[] = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do pessoa: ");
            nomes[i] = teclado.nextLine();
        }
        System.out.println("Digite o nome de uma pessoa: ");
        String pessoa = teclado.nextLine();
        int pos = -1;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(pessoa)) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            System.out.println(pessoa+" se enconttra na posição "+pos+1+" da fila");
        }else
            System.out.println("Nome não encontrado na fila!");


        teclado.close();
    }
}
