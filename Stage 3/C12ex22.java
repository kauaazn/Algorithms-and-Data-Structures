//Autor: Kauã Antônio Reis

import java.util.Scanner;

public class C12ex22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamV = 2;
        String placas[] = new String[tamV], nome[] = new String[tamV];

        for (int i = 0; i < tamV; i++) {
            System.out.print("Digite o nome do placa: ");
            placas[i] = teclado.nextLine();
            System.out.print("Digite o nome do dono da vaga: ");
            nome[i] = teclado.nextLine();
        }

        System.out.println("Digite o número da placa ou o nome de um morador: ");
        String procurar = teclado.nextLine();

        int pos = -1;

        for (int i = 0; i < tamV; i++)
            if (placas[i].equalsIgnoreCase(procurar) || nome[i].equalsIgnoreCase(procurar)) {
                pos = i;
                break;
            }

        System.out.println("A vaga do estacionamento do procurado é: "+(pos+1));
        teclado.close();
    }
}
