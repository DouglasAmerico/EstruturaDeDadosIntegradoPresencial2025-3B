package Aula2;

import java.util.Scanner;

public class funcoes {
    public static Double calculaDivisoes(Integer v1,Integer v2){
        return ((double) v1)/((double) v2);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o valor a ser dividido: ");
        Integer valor1 = leitor.nextInt();
        System.out.print("Informe o valor a que dividirá: ");
        Integer valor2 = leitor.nextInt();
        System.out.println("O valor da divisao de "+valor1+" divido por "+valor2+" é: "+calculaDivisoes(valor1,valor2));
    }
}
