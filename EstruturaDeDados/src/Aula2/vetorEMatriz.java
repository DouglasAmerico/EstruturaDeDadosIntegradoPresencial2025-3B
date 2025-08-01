package Aula2;

import java.util.Scanner;

public class vetorEMatriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final Integer tamanhoColuna = 4,tamanhoLinha= 4;
        Integer matriz[][] = new Integer[tamanhoLinha][tamanhoColuna];

        for (int linha = 0; linha < tamanhoLinha; linha++) {
            for (int coluna = 0; coluna < tamanhoColuna; coluna++) {
                System.out.print("Informe o valor da linha: "+linha+", coluna: "+coluna+": ");
                matriz[linha][coluna]= leitor.nextInt();
            }
        }
        System.out.println();
        for (int linha = 0; linha < tamanhoLinha; linha++) {
            for (int coluna = 0; coluna < tamanhoColuna; coluna++) {
                if(coluna == (tamanhoColuna - 1)) System.out.print(matriz[linha][coluna]);
                else System.out.print(matriz[linha][coluna]+" - ");
            }
            System.out.println();
        }
    }
}
