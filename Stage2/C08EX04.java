package Etapa2;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C08EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade, ate18 = 0;
        String nome;
        for (int aluno=1; aluno <=50; aluno++){
            System.out.print("Informe o seu nome: ");
            nome = teclado.nextLine();
            System.out.print("Informe a sua idade: ");
            idade = teclado.nextInt();
            if (idade<=18)
                ate18++;
            teclado.nextLine();
        }
        System.out.println("Até 18: "+ate18);
        System.out.println("Acima de 18: "+(5-ate18));
        teclado.close();

    }
}
