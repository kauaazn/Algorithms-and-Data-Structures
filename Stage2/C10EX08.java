//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C10EX08 {
    public static void main(String[] args) {

        Scanner arquivo = new Scanner(
                C10EX08.class.getResourceAsStream("ficha8.txt"));

        String BH, Contagem, Ipatinga, Betim, ZimbabueDeMinas, menorCidade = "";
        int pBH, pContagem, pIpatinga, pBetim, pZimbabueDeMinas, eBH, eContagem, eIpatinga, eBetim, eZimbabueDeMinas, contadorCidade=0, i=0;;
        int hBH, hContagem, hIpatinga, hBetim, hZimbabueDeMinas, mBH, mContagem, mIpatinga, mBetim, mZimbabueDeMinas, homensTotal=0;
        int somaSexoBH, somaSexoIpatinga, somaSexoBetim, somaSexoContagem, somaSexoAracuai, contM = 0, contMaisF = 0, populacaoMenor = 0, populacaoTotal=0, eleitoresTotal=0;


/// Cidades
        BH = arquivo.nextLine();
        Contagem = arquivo.nextLine();
        Ipatinga = arquivo.nextLine();
        Betim = arquivo.nextLine();
        ZimbabueDeMinas = arquivo.nextLine();
/// Populção das cidades
        pBH = arquivo.nextInt();
        pContagem = arquivo.nextInt();
        pIpatinga = arquivo.nextInt();
        pBetim = arquivo.nextInt();
        pZimbabueDeMinas = arquivo.nextInt();
/// Eleitores das cidades
        eBH = arquivo.nextInt();
        eContagem = arquivo.nextInt();
        eIpatinga = arquivo.nextInt();
        eBetim = arquivo.nextInt();
        eZimbabueDeMinas = arquivo.nextInt();
/// Homens das cidades
        hBH = arquivo.nextInt();
        hContagem = arquivo.nextInt();
        hIpatinga = arquivo.nextInt();
        hBetim = arquivo.nextInt();
        hZimbabueDeMinas = arquivo.nextInt();
/// Mulheres das cidades
        mBH = arquivo.nextInt();
        mContagem = arquivo.nextInt();
        mIpatinga = arquivo.nextInt();
        mBetim = arquivo.nextInt();
        mZimbabueDeMinas = arquivo.nextInt();

        somaSexoBH = mBH + hBH;
        somaSexoContagem = mContagem + hContagem;
        somaSexoIpatinga = mIpatinga + hIpatinga;
        somaSexoBetim = mBetim + eBH + eContagem;
        somaSexoAracuai = mZimbabueDeMinas + eZimbabueDeMinas;

        int[] somaSexo = {somaSexoBH, somaSexoContagem, somaSexoIpatinga, somaSexoBetim, somaSexoAracuai};
        int[] populacaoC = {pBH, pContagem, pIpatinga, pBetim, pZimbabueDeMinas};
        String[] cidade = {BH, Contagem, Ipatinga, Betim, ZimbabueDeMinas};
        int[] eleitores = {eBH, eContagem, eIpatinga, eBetim, eZimbabueDeMinas};
        int[] homens = {hBH, hContagem, hIpatinga, hBetim, hZimbabueDeMinas};
        int[] mulheres = {mBH, mContagem, mIpatinga, mBetim, mZimbabueDeMinas};

        do {

            contadorCidade++;
            populacaoTotal+=populacaoC[i];
            eleitoresTotal+=eleitores[i];
            homensTotal+=homens[i];

            if (somaSexo[i] != populacaoC[i]) {
                System.out.println("Soma de H e M diferente da população na cidade: " + cidade[i]);
            }

            if (mulheres[i] > homens[i]) {
                contMaisF++;
            }

            if (i == 1 || populacaoC[i] < populacaoMenor) {
                populacaoMenor = populacaoC[i];
                menorCidade = cidade[i];
            }

            if(cidade[i].equalsIgnoreCase("Zimbabue de Minas"))
                break;
            i++;

        } while (true);

        double media = (float) homensTotal/contadorCidade;
        double percentual = (float) eleitoresTotal / populacaoTotal;


        System.out.printf("Total de cidades: " + contadorCidade + "\nPopulação total: " + populacaoTotal +
                "\nPercentual de eleitores: %1.2f",percentual*100);
        System.out.print("%");
        System.out.printf("\nCidade com mais mulheres: " + contMaisF + "\nMédia de homens: %1.2f", media);
        System.out.print("\nCidade com menor populção: " + menorCidade);

        arquivo.close();
    }
}

