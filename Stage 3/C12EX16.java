//Autor: Kauã Antônio Reis;
package Etapa3;
import java.util.Scanner;

public class C12EX16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome[] = new String[100];
        String estado[] = new String[100];
        double populacao[] = new double[100];
        String tempNome, tempEstado;
        double tempPop;

        // Entrada de dados
        for (int aux = 0; aux < nome.length; aux++) {
            System.out.print("Digite o nome da cidade: ");
            nome[aux] = teclado.nextLine();
            System.out.print("Digite o estado: ");
            estado[aux] = teclado.nextLine();
            System.out.print("Digite a população: ");
            populacao[aux] = teclado.nextDouble();
            teclado.nextLine(); // limpar buffer
        }

        // Ordenação decrescente por população (método da bolha)
        for (int aux = 0; aux < populacao.length - 1; aux++) {
            for (int x = 0; x < populacao.length - 1 - aux; x++) {
                if (populacao[x] < populacao[x + 1]) {
                    // Troca população
                    tempPop = populacao[x];
                    populacao[x] = populacao[x + 1];
                    populacao[x + 1] = tempPop;

                    // Troca nome correspondente
                    tempNome = nome[x];
                    nome[x] = nome[x + 1];
                    nome[x + 1] = tempNome;

                    // Troca estado correspondente
                    tempEstado = estado[x];
                    estado[x] = estado[x + 1];
                    estado[x + 1] = tempEstado;
                }
            }
        }

        // Impressão das 10 maiores cidades
        System.out.println("\nAs 10 maiores cidades são:\n");
        for (int aux = 0; aux < 10; aux++) {
            System.out.println((aux + 1) + " - " + nome[aux] + " (" + estado[aux] + ") - População: " + populacao[aux]);
        }

        teclado.close();
    }
}