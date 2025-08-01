package Aula1;

import java.util.Scanner;

public class recepcaoDeMenorValor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final Integer quatidadeDeInsercoes = 5;
        Integer menorValor= null, valor,maiorValor= null;
        for (int i = 1; i <= quatidadeDeInsercoes; i++) {
            do {
                System.out.print("Informe o "+i+"° valor: ");
                valor = leitor.nextInt();
                if(valor < 0) System.out.println("Informe um valor positivo");
            }while (valor < 0);

            if (i == 1) {
                menorValor= valor;
                maiorValor= valor;
            }
            else if(valor < menorValor) menorValor= valor;
            else if(valor > maiorValor) maiorValor= valor;
        }

        System.out.println("O menor valor informado foi "+menorValor);
        System.out.println("O maior valor informado foi "+maiorValor);
    }
}
