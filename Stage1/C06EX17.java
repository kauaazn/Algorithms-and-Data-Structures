package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C06EX17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int curTec, curSup, men3anosExp, criat, prefLid, prefTrabSoz, autodidata, aceitaSlr, soAceitaBh, apto;
        System.out.println("Responda com 1 para VERDADEIRO e 0 para FALSO para cada pergunta: ");
        System.out.print("1) Você tem curso técnico de programação?");
        curTec = teclado.nextInt();
        System.out.print("2) Você tem curso superior de programção?");
        curSup = teclado.nextInt();
        System.out.print("3) Você tem menos de 3 anos de experiência em programação?");
        men3anosExp = teclado.nextInt();
        System.out.print("4) Você se considere uma pessoa criativa?");
        criat = teclado.nextInt();
        System.out.print("5) Você prefere liderar a ser liderado?");
        prefLid = teclado.nextInt();
        System.out.print("6) Você prefere trabalhar sozinho a trabalhar em equipe?");
        prefTrabSoz = teclado.nextInt();
        System.out.print("7) Você é autodidata (aprende sozinho)?");
        autodidata = teclado.nextInt();
        System.out.print("8) Você aceitaria uma remuneração incial de R$1500?");
        aceitaSlr = teclado.nextInt();
        System.out.print("9) Você só aceitaria trabalharem escritórios da empresa dentro da grande BH?");
        soAceitaBh = teclado.nextInt();
        apto = 1;
        if (curTec == 1 || men3anosExp == 0)
            apto = 1;
        if (prefLid == 1 && aceitaSlr == 1)
            apto = 0;
        if (apto == 1)
            System.out.println("Você está apto a tralhar na empresa! ");
        else
            System.out.println("Você não está apto a trabalhar na empresa! ");
        teclado.close();




    }
}
