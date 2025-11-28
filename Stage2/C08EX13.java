//Autor: Kauã Antônio Reis
package Etapa2;

import java.util.Scanner;

public class C08EX13 {
    public static void main(String[] args) {
        Scanner arquivo = new Scanner(
                C08EX13.class.getResourceAsStream("ficha13.txt"));

        String BH, Contagem, Ipatinga, Betim, Aracuai, maiorCidade = "";
        int pBH, pContagem, pIpatinga, pBetim, pAracuai, eBH, eContagem, eIpatinga, eBetim, eAracuai;
        int hBH, hContagem, hIpatinga, hBetim, hAracuai, mBH, mContagem, mIpatinga, mBetim, mAracuai;
        int somaSexoBH, somaSexoIpatinga, somaSexoBetim, somaSexoContagem, somaSexoAracuai, contM = 0, contS = 0, populacaoMenor = 0;

        BH = arquivo.nextLine();
        Contagem = arquivo.nextLine();
        Ipatinga = arquivo.nextLine();
        Betim = arquivo.nextLine();
        Aracuai = arquivo.nextLine();
        pBH = arquivo.nextInt();
        pContagem = arquivo.nextInt();
        pIpatinga = arquivo.nextInt();
        pBetim = arquivo.nextInt();
        pAracuai = arquivo.nextInt();
        eBH = arquivo.nextInt();
        eContagem = arquivo.nextInt();
        eIpatinga = arquivo.nextInt();
        eBetim = arquivo.nextInt();
        eAracuai = arquivo.nextInt();
        hBH = arquivo.nextInt();
        hContagem = arquivo.nextInt();
        hIpatinga = arquivo.nextInt();
        hBetim = arquivo.nextInt();
        hAracuai = arquivo.nextInt();
        mBH = arquivo.nextInt();
        mContagem = arquivo.nextInt();
        mIpatinga = arquivo.nextInt();
        mBetim = arquivo.nextInt();
        mAracuai = arquivo.nextInt();

        somaSexoBH = mBH + hBH;
        somaSexoContagem = mContagem + hContagem;
        somaSexoIpatinga = mIpatinga + hIpatinga;
        somaSexoBetim = mBetim + eBH + eContagem;
        somaSexoAracuai = mAracuai + eAracuai;

        int[] somaSexo = {somaSexoBH, somaSexoContagem, somaSexoIpatinga, somaSexoBetim, somaSexoAracuai};
        int[] populacaoC = {pBH, pContagem, pIpatinga, pBetim, pAracuai};
        String[] cidade = {BH, Contagem, Ipatinga, Betim, Aracuai};
        int[] eleitores = {eBH, eContagem, eIpatinga, eBetim, eAracuai};
        int[] homens = {hBH, hContagem, hIpatinga, hBetim, hAracuai};
        int[] mulheres = {mBH, mContagem, mIpatinga, mBetim, mAracuai};

        for (int i = 0; i <= 4; i++) {
            if (somaSexo[i] != populacaoC[i]) {
                System.out.println("Soma de H e M diferente da população na cidade: " + cidade[i]);
            }

            if (populacaoC[i] > 1000000) {
                contM++;
            }

            if (mulheres[i] > homens[i]) {
                contS++;
            }

            if (i == 1 || populacaoC[i] < populacaoMenor) {
                populacaoMenor = populacaoC[i];
                maiorCidade = cidade[i];

            }
        }

        for (int i = 0; i <= 4; i++) {
            double percentual = (float) eleitores[i] / populacaoC[i];
            System.out.printf("Percentual de eleitores de " + cidade[i] + ": %1.1f", percentual * 100);
            System.out.print("%\n");
        }

        System.out.print("População com mais de 1M de habitantes: " + contM + "\nQuantidade de cidades com mais mulheres: " + contS +
                "\nCidade com menor população: " + maiorCidade);


        arquivo.close();
    }
}
