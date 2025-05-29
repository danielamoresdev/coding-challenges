import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduzca una frase/palabra > ");
            String cad = sc.nextLine();
            if (palindrome_check(cad)) {
                System.out.printf("La frase/palabra '%s' es un palíndromo%n", cad);
            } else {
                System.out.printf("La frase/palabra '%s' no es un palíndromo%n", cad);
            }
        }
    }

    public static boolean palindrome_check(String cad) {
        String clean = cad.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }
}
