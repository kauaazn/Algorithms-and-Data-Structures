//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C11EX02a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, nomeMenor="";
        int  contBronze=0, contPrata=0, contOuro=0;
        double valorAplicado, valorAplicadoBronze=0, totalAplicado=0, menorValorA=0;




        while(true) {
            System.out.println("Digite seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Digite o valor aplicado: ");
            valorAplicado = teclado.nextDouble();
            teclado.nextLine();

            if(valorAplicado<=1000){
                System.out.println(nome+" - Bronze");
                contBronze++;
                valorAplicadoBronze += valorAplicado;
            }else if(valorAplicado<=5000){
                System.out.println(nome+" - Prata");
                contPrata++;
            }else {
                System.out.println(nome + " - Ouro");
                contOuro++;
            }

            totalAplicado += valorAplicado;


            if(valorAplicado<menorValorA){
                menorValorA =valorAplicado;
                nomeMenor = nome;
            }

            if(nome.equalsIgnoreCase("Reynaldo Duarte")){
                break;
            }

        }

        double mediaBronze = valorAplicadoBronze/contBronze;

        System.out.println("---------------------------------------");
        System.out.println("Classificação de clientes: "
                +"\nBronze: "+contBronze
                +"\nPrata: "+contPrata
                +"\nOuro: "+contOuro);
        System.out.println("Média dos valores aplicados dos clientes bronzes: R$"+mediaBronze);
        System.out.printf("Volume total das aplicações: R$%1.2f",totalAplicado);
        System.out.println("\nNome do cliente com menor aplicação: "+nomeMenor);



        teclado.close();
    }
}
