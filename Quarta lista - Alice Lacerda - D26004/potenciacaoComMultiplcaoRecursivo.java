package Lista_4;
import java.util.Scanner;
public class potenciacaoComMultiplcaoRecursivo {
    static Scanner teclado = new Scanner(System.in);

    // Metodo de potenciação recursivo
    public static int petenciacao(int base, int expoente, int resultado){
        if (expoente > 0){
            expoente--;
            return petenciacao(base, expoente, resultado * base);
        }

        return resultado;
    }

    static void main(String[] args) {
        int base, expoente, resultado = 1;

        // Coletando números.
        System.out.println("Qual a base? ");
        base = teclado.nextInt();
        System.out.println("E o expoente? ");
        expoente = teclado.nextInt();

        resultado = petenciacao(base, expoente, resultado);
        System.out.println("Resultado: " + resultado);
        teclado.close();
    }
}
