package Exemplos;

import java.util.ArrayList;

public class Pecas {
    public static ArrayList<String> nomes = new ArrayList<String>();
    private final String del = "deletado";
    private final String add = "adicionado";

    private void mensagemConfirmacao(String produto,String status){
        System.out.println();
        System.out.println("Produto "+produto+" foi "+status+" com sucesso");
        System.out.println();
    }

    public Pecas(){
        String[] nomePecas = {"Filtro de Ar", "Pastilha de Freio", "Vela de Ignição", "Óleo de Motor"};
        for (String valor : nomePecas){
            nomes.add(valor);
        }
    }

    public ArrayList<String> getPecas(){
        return nomes;
    }

    public void AddPecas(String novaPeca){
        nomes.add(novaPeca);
        mensagemConfirmacao(novaPeca,add);
    }

    public void RemovePecas(Integer id){
        mensagemConfirmacao(nomes.get(id),del);
        nomes.remove(id);
    }


}