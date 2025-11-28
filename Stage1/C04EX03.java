package Etapa1;
//Autor: Kauã Antônio Reis
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C04EX03 {
    public static void main(String[] args) {
        double poluMin, poluMax, preco1, preco2, preco3;

        Scanner teclado = new Scanner(System.in) ;
        System.out.print("MINIMO DE POLUENTES: ");
        poluMin = teclado.nextDouble();
        System.out.print("POLUENTES MAXIMO: ");
        poluMax = teclado.nextDouble();
        System.out.print("PEÇO MÍNIMO: ");
        preco1 = teclado.nextDouble();
        System.out.print("PREÇO SEM ULTRAPASSAR: ");
        preco2 = teclado.nextDouble();
        System.out.print("PREÇO ULTRAPASSANDO: ");
        preco3 = teclado.nextDouble();

        System.out.print("\n=======================================================================\n \n"+"Quantidade de poluentes Emitidos x Valor de multa \n"+"---------------------------------------------------------- \n"+"Até "+poluMin+" Multa de R$ "+preco1+"\n"+"----------------------------------------------------------\n"+"Entre "+poluMin+" e "+poluMax+" multa de R$ "+preco2+"\n"+"----------------------------------------------------------\n"+"Acima de "+poluMax+" Multa de R$ "+preco3+" por poluente emitido\n"+"=======================================================================\n "
        );



    }
}
