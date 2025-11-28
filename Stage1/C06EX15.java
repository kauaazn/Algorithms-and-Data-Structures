package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;

public class C06EX15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cod, diar;
        double conta, ppDia, serEx;
        String cidade;

        System.out.print("Informe a cidade onde mora: ");
        cidade = teclado.nextLine();
        System.out.print("Informe o código do seu pacote:  ");
        cod = teclado.nextInt();
        System.out.print("Infome a quantidade de dias utilizados:  ");
        diar = teclado.nextInt();
        System.out.print("Informe o valor dos serviços extras: ");
        serEx = teclado.nextDouble();


/// COD 1 ////////////////////////////////////////////////////////////////////////////////////////////////////
        if (cod==1){
            //Cidade de BH
            if ((cidade.equals("Belo Horizonte"))||(cidade.equals("belo horizonte"))){
                ppDia= diar*1.20;
                if (ppDia>65.00){
                    ppDia=65.00;
                }
                conta= 65.00+ppDia+serEx;
                System.out.print("Conta= "+conta );
            }
            //Cidade de SP
            else if ((cidade.equals("São Paulo")) || (cidade.equals("são paulo"))){
                ppDia= diar*1.20;
                if (ppDia>65.00){
                    ppDia=65.00;
                }
                conta = 65.00+ppDia+serEx+(0.01*(65+ppDia+serEx));
                System.out.print("Conta= "+conta );

            }
            //Cidade de RJ
            else if ((cidade.equals("Rio de Janeiro")) || (cidade.equals("rio de janeiro"))){
                ppDia= diar*1.20;
                if (ppDia>65.00){
                    ppDia=65.00;
                }
                conta = 65.00+ppDia+serEx+(0.015*(65+ppDia+serEx));
                System.out.print("Conta= "+conta );

            }
            else{
                ppDia= diar*1.20;
                if (ppDia>65.00){
                    ppDia=65.00;
                }
                conta = 65.00+ppDia+serEx+(0.015*(65+ppDia+serEx));
                System.out.print("Conta= "+conta );

            }

        }


///COD 2 ////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (cod==2) {
            //Cidade de BH
            if ((cidade.equals("Belo Horizonte")) || (cidade.equals("belo horizonte"))){
                ppDia= diar*2.1;
                conta= 104+ppDia+serEx;
                System.out.print("Conta= "+conta );
            }
            //Cidade de SP
            else if ((cidade.equals("São Paulo")) || (cidade.equals("são paulo"))){
                ppDia= diar*2.1;
                conta = 104+ppDia+serEx+(0.015*(104+ppDia+serEx));
                System.out.print("Conta= "+conta );

            }
            //Cidade de RJ
            else if ((cidade.equals("Rio de Janeiro")) || (cidade.equals("rio de janeiro"))){
                ppDia= diar*2.1;
                conta = 104+ppDia+serEx+(0.015*(104+ppDia+serEx));
                System.out.print("Conta= "+conta );

            }
            else{
                ppDia= diar*2.1;
                conta = 104+ppDia+serEx+(0.015*(104+ppDia+serEx));
                System.out.print("Conta= "+conta );

            }
        }

///COD 3 ////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (cod==3) {
            //Cidade de BH
            if ((cidade.equals("Belo Horizonte")) || (cidade.equals("belo horizonte"))){
                conta= 137+serEx;
                System.out.print("Conta= "+conta );
            }
            //Cidade de SP
            else if ( ( cidade.equals("São Paulo") ) || ( cidade.equals("são paulo")) )   {
                conta = 137+serEx+(0.02*(137+serEx));
                System.out.print("Conta= "+conta );

            }
            //Cidade de RJ
            else if ((cidade.equals("Rio de Janeiro")) || (cidade.equals("rio de janeiro"))){
                conta = 137+serEx+(0.02*(137+serEx));
                System.out.print("Conta= "+conta );

            }
            else{
                conta = 137+serEx+(0.02*(137+serEx));
                System.out.print("Conta= "+conta );
            }
        }




        teclado.close();
    }
}