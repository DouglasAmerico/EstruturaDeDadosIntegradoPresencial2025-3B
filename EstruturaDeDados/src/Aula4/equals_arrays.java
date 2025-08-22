package Aula4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class equals_arrays {
    public static void main(String[] args) {
        ArrayList<String> jjj = new ArrayList<String>();

















        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<String> nomes2 = new ArrayList<String>();

        nomes.addAll(Arrays.asList("Douglas","Eduardo","Ricardo"));
        nomes2.addAll(Arrays.asList("Douglas","Eduardo","Ricardo"));
        if (nomes.equals(nomes2)){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
    }
}



