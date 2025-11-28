package Etapa1;
//Autor: Kauã Antônio Reis

import java.util.Scanner;
public class C03EX05 {
    public static void main(String[] args) {
        String nome;
        int anoNascimento, anoAtual, idade;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome:");
        nome = teclado.nextLine();
        System.out.print("Digite o ano em que você nasceu:");
        anoNascimento = teclado.nextInt();
        System.out.print("Digite o ano em que estamos:");
        anoAtual = teclado.nextInt();
        idade = anoAtual - anoNascimento;
        System.out.println(nome + ", você tem/terá " + idade + " anos em " + anoAtual);
        teclado.close();
    }

}
