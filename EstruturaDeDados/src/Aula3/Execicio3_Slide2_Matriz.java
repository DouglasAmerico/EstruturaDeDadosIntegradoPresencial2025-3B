package Aula3;

import java.util.Scanner;

public class Execicio3_Slide2_Matriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o tamanho: ");
        Integer tamanho = leitor.nextInt();
        Double matriz[][] = new Double[tamanho][tamanho];

        for (int linha=0;linha<tamanho;linha++){
            for (int coluna = 0; coluna < tamanho; coluna++) {
                System.out.print("Informe o valor da linha "+linha+" coluna "+coluna+"+: ");
                matriz[linha][coluna]= leitor.nextDouble();
            }

        }
        System.out.println("-----------------------");
        for (int linha=0;linha<tamanho;linha++){
            for (int coluna = 0; coluna < tamanho; coluna++) {
                System.out.println("Linha "+linha+" coluna "+coluna+": "+matriz[linha][coluna]);
            }
        }
    }
}
