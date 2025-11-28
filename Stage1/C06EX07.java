package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C06EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, impostoRenda, plL, plb, valorFixo;
        System.out.print("Informe seu salário: ");
        salario = teclado.nextDouble();
        if (salario <=300){
            plb = 500 + salario * 0.7;
            impostoRenda = 0.25 * plb;
            plL = plb - impostoRenda;
            System.out.printf("PL Líquido:"+plL);
        }
        if (salario > 300 && salario <=1000){
            plb = 200 + salario * 0.5;
            impostoRenda = 0.25 * plb;
            plL = plb - impostoRenda;
            System.out.printf("PL Líquido:"+plL);
        }
        else{
            plb = 0 + salario * 0.3;
            impostoRenda = 0.25 * plb;
            plL = plb - impostoRenda;
            System.out.printf("PL Líquido:"+plL);
        }
        teclado.close();

    }
}