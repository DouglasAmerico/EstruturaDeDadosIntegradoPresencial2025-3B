package Aula3;
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();
        Boolean contemMaca = false;
        frutas.add("-Maça");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add(1,"Morango");
        frutas.remove("Laranja");
        for (int i = 0; i < frutas.size(); i++) {
            if (frutas.get(i) == "Maça"){
                contemMaca= true;
            }
        }

        for (String fruta : frutas){
            if (fruta == "Maça"){
                contemMaca= true;
            }
        }

        if (contemMaca){
            System.out.println("Contem maçã");
        }else{
            System.out.println("Não comte maçã");
        }
        System.out.println("O tamanho do array é: "+frutas.size());
    }
}


