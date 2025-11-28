package Etapa2;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C08EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont1=0, cont2=0, cont3=0, codigo;
        System.out.println("Código dos eleitores\nFulano = 1\n Ciclano = 2\n Beltrano = 3");
        for (int eleitor=1; eleitor<=100; eleitor++){
            System.out.print("Informe o código do candidato: ");
            codigo = teclado.nextInt();
            if (codigo==1) {
                System.out.println("Você votou em Fulano ");
                cont1++;
            }
            else if (codigo==2){
                    System.out.println("Você votou em Ciclano ");
                    cont2++;
                }
                else if (codigo==3){
                        System.out.println("Você votou em Beltrano ");
                        cont3++;
                    }


        }
        System.out.println("Fulano obteve: "+cont1);
        System.out.println("Ciclano obteve: "+cont2);
        System.out.println("Beltrano obteve: "+cont3);
        if (cont1>cont2 && cont1>cont3)
            System.out.println("Fulano foi o vencedor");
        if (cont2>cont1 && cont2>cont3)
            System.out.println("Ciclano foi o vencedor");
        if (cont3>cont1 && cont3>cont2)
            System.out.println("Beltrano foi o vencedor");
        teclado.close();


    }
}
