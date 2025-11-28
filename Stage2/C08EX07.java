//Autor: Kauã Antônio Reis;
package Etapa2;
import java.util.Scanner;
public class C08EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade, rep, soma=0, ate12=0, acima30=0;
        double media;
        System.out.print("Quantos alunos serão informados? ");
        rep = teclado.nextInt();
        for (int aluno = 1; aluno<= rep; aluno++){
            System.out.print("Informe seu nome: ");
            nome = teclado.nextLine();
            System.out.print("Informe sua idade: ");
            idade = teclado.nextInt();
            if (idade<=12){
                ate12++;
            }
            if (idade>30){
                acima30++;
            }
        }
        media = (float) soma/ate12+acima30;
        System.out.println("A média deu: "+media);
        teclado.close();
    }
}
