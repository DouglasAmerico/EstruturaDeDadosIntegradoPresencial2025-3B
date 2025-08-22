package Aula4;

public class equals_igual_igual {
    public static void main(String[] args) {
        String s1 = "Java"; // O Java cria uma caixinha com "Java"
        String s2 = "Java"; // Ele é esperto! Reusa a mesma caixinha
        String s3 = new String("Java");
        // A gente força ele a criar uma caixinha NOVA, mesmo com o mesmo conteúdo

        System.out.println("s1 == s2: " + (s1 == s2)); // true (ambos apontam pra mesma caixinha)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (apontam pra caixinhas DIFERENTES)
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        // true (o conteúdo das caixinhas é igual!)
    }
}



