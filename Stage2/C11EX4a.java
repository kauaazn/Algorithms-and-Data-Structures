//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C11EX4a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, sexo, nomeMaior="";
        int idade, pontosCart, idadeMaior=0, mulher7p=0;
        double multa, mediaIdade, contMedia=0, idadeTotal=0, totalMultas=0, totalH=0, Hmutaldos=0;




        for(int i=1; i<=230; i++) {
            System.out.println("Digite seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Digite sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Digite seu sexo: ");
            sexo = teclado.nextLine();
            System.out.println("Digite quantiade de pontos na carteira: ");
            pontosCart = teclado.nextInt();
            System.out.println("Digite o valor da multa: ");
            multa = teclado.nextDouble();
            teclado.nextLine();

            idadeTotal += idade;
            contMedia++;

            totalMultas += multa;

            if (sexo.equalsIgnoreCase("M")) {
                totalH++;
                if (multa>0)
                    Hmutaldos ++;
            }

            if(idade>idadeMaior){
                idadeMaior = idade;
                nomeMaior = nome;
            }

            if(sexo.equalsIgnoreCase("F") && pontosCart == 7){
                mulher7p++;
            }



        }

        double percentHomensMultados = Hmutaldos/totalH;

        mediaIdade = idadeTotal/contMedia;
        System.out.println("---------------------------------------");
        System.out.println("Idade média dos condutores: "+mediaIdade);
        System.out.println("Valor total das multas applicadas: "+totalMultas);
        System.out.println("Perncentual de homens multados: "+percentHomensMultados);
        System.out.println("Quantidade de mulheres que perderam 7 pontos na carteira: "+mulher7p);
        System.out.println("Nome e idade da pessoa mais velha: "+nomeMaior+" "+idadeMaior+" anos");



        teclado.close();
    }
}
