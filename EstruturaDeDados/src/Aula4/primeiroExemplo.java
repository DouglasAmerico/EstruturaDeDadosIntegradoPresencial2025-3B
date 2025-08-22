package Aula4;

import java.util.ArrayList;

public class primeiroExemplo {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");
        nomes.add(1,"Pedro");
        System.out.println(nomes);
        nomes.remove(2);
        System.out.println(nomes.get(2));
    }
}
