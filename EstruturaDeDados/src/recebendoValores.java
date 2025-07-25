import java.util.Scanner;

public class recebendoValores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        String nome = leitor.nextLine();
        System.out.print("Informe a idade do "+nome+": ");
        Integer idade = leitor.nextInt();
        System.out.print("Informe o sobrenome do "+nome+": ");
        String sobrenome = leitor.next();
        System.out.println("O nome é: "+nome);
    }
}