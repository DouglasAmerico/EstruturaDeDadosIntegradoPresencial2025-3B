package Exemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicioFinalAula4 {
    public static Scanner leitor = new Scanner(System.in);

    private static void listarPecas(ArrayList<String> pecas, Boolean comId){
        if(comId){
            for (int i = 0; i < pecas.size(); i++) {
                System.out.println("ID: "+i+" Peça: "+pecas.get(i));
            }
        }else{
            for (String peca : pecas) {
                System.out.println("Peça: "+peca);
            }
        }
    }

    public static void main(String[] args) {
        Pecas pecas = new Pecas();
        listarPecas(pecas.getPecas(),false);

        System.out.print("Qual o nome da peca que quer adicionar: ");
        pecas.AddPecas(leitor.nextLine());
        listarPecas(pecas.getPecas(),true);


    }
}
