package Etapa1;
//Autor: Kauã Antônio Reis
import java.sql.SQLOutput;
import java.util.Scanner;
public class C05EX03 {
    public static void main(String[] args) {
        double salario, impostoDeRenda, liquido;
        int numDependentes;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o seu salario: ");
        salario = teclado.nextDouble();
        System.out.print("Informe os números dependentes: ");
        numDependentes = teclado.nextInt();
        liquido = salario - (numDependentes * 60);
        impostoDeRenda = liquido * 15/100;
        System.out.println("líquido: "+liquido);
        System.out.println("Imposto de renda: "+impostoDeRenda);
        teclado.close();
    }
}
