import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String input = scanner.nextLine();

        int count = ocorrenciasDeA(input);

        if (count > 0) {
            System.out.println("A letra 'a' ocorre " + count + " vezes.");
        } else {
            System.out.println("A letra 'a' não ocorre ");
        }
    }

    public static int ocorrenciasDeA(String str) {
        int count = 0;
        for (int  i= 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}