package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C06EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double vendas, salario,comissao;
        System.out.print("Informe o valor mensal das vendas: ");
        vendas = teclado.nextDouble();
        if (vendas <= 1000)
            comissao = 0;
        else
            if (vendas<=10000)
                comissao = vendas * 0.1;
            else
                comissao = 1000;
            salario = 240 + comissao;
        System.out.println("Salário = R$: "+salario);
        teclado.close();

    }
}
