package Aula3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_Aula_4 {
    public static Scanner leitor = new Scanner(System.in);
    final private static Boolean ComID = true;
    final private static Boolean SemID = false;

    public static void imprimir(ArrayList<String> pecas,Boolean comID){
            System.out.println();
            System.out.println("----------Peças em estoque---------");
            for (int i = 0; i < pecas.size(); i++) {
                if(comID) System.out.println("ID: "+i+" Peça: "+pecas.get(i));
                else System.out.println("Peça: "+pecas.get(i));
            }
            System.out.println("-----------------------------------");
            System.out.println();
    }

    public static String contemOValor(ArrayList<String> pecas,String peca){
        String retorno;
        if(pecas.contains(peca)){
            retorno= "A peça "+peca+" esta contida dentro do Array";
        }else{
            retorno= "A peça "+peca+" não esta contida dentro do Array";
        }
        return retorno;
    }

    public static void main(String[] args) {
        ArrayList<String> pecasEmEstoque = new ArrayList<String>();
        pecasEmEstoque.addAll(Arrays.asList("Filtro de Ar", "Pastilha de Freio", "Vela de Ignição", "Óleo de Motor"));

        System.out.print("Informe a peça a ser adicionada: ");
        pecasEmEstoque.add(leitor.nextLine());
        imprimir(pecasEmEstoque,SemID);//estou mandando o arraylist com mais peças para ser impresso

        System.out.println("Removendo a peça Filtro de Ar");
        pecasEmEstoque.remove("Filtro de Ar");
        imprimir(pecasEmEstoque,SemID);

        System.out.print("Informe a peça para verificar disponibilidade: ");
        System.out.println(contemOValor(pecasEmEstoque,leitor.nextLine()));

        imprimir(pecasEmEstoque,SemID);
        System.out.println("O numero total de peças em estoque é: "+pecasEmEstoque.size());

        imprimir(pecasEmEstoque,ComID);
        System.out.print("Informe o ID da peça que você quer alerar: ");
        Integer pecaAlteracao = leitor.nextInt();
        System.out.print("Qual o nome que vai substituir a peça "+pecasEmEstoque.get(pecaAlteracao)+"?");
        leitor.nextLine();
        pecasEmEstoque.set(pecaAlteracao,leitor.nextLine());
        imprimir(pecasEmEstoque,SemID);
    }
}
