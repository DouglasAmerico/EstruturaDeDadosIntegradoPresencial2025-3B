package Aula3;

import java.util.Scanner;

public class Execicio3_Slide2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o tamanho: ");
        Integer tamanho = leitor.nextInt();
        Double vetor[] = new Double[tamanho];

        for (int i=0;i<tamanho;i++){
            System.out.print("Informe o valor da posição "+i+": ");
            vetor[i]= leitor.nextDouble();
        }
        System.out.println("-----------------------");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Posição "+i+" valor: "+vetor[i]);
        }
    }
}
