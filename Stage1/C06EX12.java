package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C06EX12 {
    public static void main(String[] args) {
        int bolasProduzir,mesePcopa,bolasDefeito, bolasBoas,aluguel,quantCaixa;

        double precoDecaixa,aluguelGalp,custoCaixa,custoGalp,soma;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas bolas vai produzir? ");
        bolasProduzir=teclado.nextInt();
        System.out.print("Qual preço da caixa de papelão? ");
        precoDecaixa= teclado.nextDouble();
        System.out.print("Quantos meses p copa? ");
        mesePcopa= teclado.nextInt();
        System.out.print("Quantas bolas deram defeitos? ");
        bolasDefeito= teclado.nextInt();
        System.out.print("quantos de aluguel vc vai pagar por galpão? ");
        aluguelGalp= teclado.nextDouble();


        bolasBoas=bolasProduzir-bolasDefeito;
        quantCaixa=( bolasBoas + 9)/10;
        aluguel= (quantCaixa + 849)/850;
        custoCaixa= quantCaixa*precoDecaixa;
        custoGalp= aluguelGalp*mesePcopa*aluguel;
        soma=custoGalp+custoCaixa;


        System.out.print(soma);
        teclado.close();
    }
}
