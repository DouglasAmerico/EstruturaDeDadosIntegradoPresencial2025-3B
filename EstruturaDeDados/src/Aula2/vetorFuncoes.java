package Aula2;

import java.util.Scanner;

public class vetorFuncoes {
    public static Scanner leitor = new Scanner(System.in);

    public static Integer[] quantidadesListaDeCompras(String[] lista) {
        Integer quantidadesItens[] = new Integer[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Qual a quantidade do item " + lista[i] + ": ");
            quantidadesItens[i] = leitor.nextInt();
        }
        return quantidadesItens;
    }


    public static void main(String[] args) {
        String listaDeCompra[] = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o produto: ");
            listaDeCompra[i] = leitor.nextLine();
        }

        Integer quantidadeDosItensDaListaDeCompras[] = new Integer[3];
        quantidadeDosItensDaListaDeCompras = quantidadesListaDeCompras(listaDeCompra);

        for (int i = 0; i < 3; i++) {
            System.out.println("Produto: "+listaDeCompra[i]+" - quantidade em estoque: "+quantidadeDosItensDaListaDeCompras[i]);
        }
    }
}
