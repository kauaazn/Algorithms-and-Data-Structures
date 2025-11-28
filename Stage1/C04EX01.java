package Etapa1;

//Autor: Kauã Antônio Reis

import java.util.Scanner;
public class C04EX01 {
    public static void main(String[] args) {
        String sobrenome, primeiroNome, segundoNome;
        int idade;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe seu sobreNome:");
        sobrenome = teclado.nextLine();
        System.out.println("Informe seu primeiro nome:");
        primeiroNome = teclado.nextLine();
        System.out.println("Informe seu segundo nome:");
        segundoNome = teclado.nextLine();
        System.out.println("Informe sua idade:");
        idade = teclado.nextInt();
        System.out.println(sobrenome+", "+primeiroNome+" "+segundoNome);
        System.out.println("idade: "+idade+" anos,");
        teclado.close();






    }
}
