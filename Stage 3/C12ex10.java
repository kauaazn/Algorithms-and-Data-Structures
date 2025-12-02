//Autor: Kauã Antônio REis
import java.util.Scanner;
public class C12ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notas[] = new int[8];
        String nomes[] = new String[8];
        double media, somatorioNotas=0;

        for(int i = 0; i< notas.length; i++){
            System.out.println("Digite o seu nome: ");
            nomes[i] = teclado.nextLine();
            System.out.println("Digite sua nota: ");
            notas[i] = teclado.nextInt();
            teclado.nextLine();
            somatorioNotas += notas[i];
        }
        media = somatorioNotas/notas.length;

        System.out.print("Dados informados: ");
        for(int i = 0; i< notas.length; i++){
            System.out.print(nomes[i]+"/"+notas[i]+" ");
        }

        System.out.print("\nNome impresso: ");
        for(int i = 0; i < notas.length; i++){
            if(notas[i]>media){
                System.out.print(nomes[i]+",");
            }
        }
        System.out.println("\b");


        teclado.close();
    }
}