package Aula3;

import java.util.Scanner;

public class exemplo {
    public static Scanner leitor = new Scanner(System.in);

    public static Double[] leituraDasNotas(String[] nomes,String tipo){
        int tamanho = nomes.length;
        Double[] notas = new Double[tamanho];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe a nota de "+tipo+" do aluno "+nomes[i]+": ");
            notas[i]= leitor.nextDouble();
        }
        return notas;
    }


    public static void main(String[] args) {
        System.out.print("Informe a quantidade de alunos: ");
        Integer tamanho = leitor.nextInt();
        String[] nomes = new String[tamanho];
        Double[] prova1 = new Double[tamanho];
        Double[] prova2 = new Double[tamanho];
        Double[] trabalho = new Double[tamanho];

        leitor.nextLine();
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o nome do aluno(a): ");
            nomes[i]= leitor.nextLine();
        }

        prova1= leituraDasNotas(nomes,"Prova 1");
        prova2= leituraDasNotas(nomes,"Prova 2");
        trabalho= leituraDasNotas(nomes,"Trabalho");
    }
}
