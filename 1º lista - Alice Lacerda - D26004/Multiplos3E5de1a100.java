import java.util.Scanner;
// Dizer quais são os multiplos de 3 e 5 de 1 à 100.
public class Multiplos3E5de1a100 {
    static void main() {

        // Declarando variaveis.
        int multiplo5 = 5, multiplo3 = 3;
        String multiplos5 = "", multiplos3 = "";
        Scanner teclado = new Scanner(System.in);

        // Calculando multiplos de 5.
        do {
            multiplos5 += String.valueOf(multiplo5) + "   ";
            multiplo5 += 5;
        } while (multiplo5 <= 100);

        // Calculando multiplos de 3.
        do {
            multiplos3 += String.valueOf(multiplo3) + "   ";
            multiplo3 += 3;
        } while (multiplo3 <= 100);

        // Dizendo multiplos de 5 e de 3 de 1 à 100.
        System.out.println("Os multiplos de 5 de 1 à 100 são: " + multiplos5);
        System.out.println("Os multiplos de 3 de 1 à 100 são: " + multiplos3);
        teclado.close();
    }
}
