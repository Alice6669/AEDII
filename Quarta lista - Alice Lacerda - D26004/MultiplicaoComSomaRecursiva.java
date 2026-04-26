package Lista_4;
import java.util.Scanner;
public class MultiplicaoComSomaRecursiva {
    static Scanner teclado = new Scanner(System.in);

    public static int multiplicacao(int numero, int multiplicador, int resultado){
        if (multiplicador > 0){
            multiplicador--;
            return multiplicacao(numero, multiplicador, resultado + numero);
        }

        return resultado;
    }

    static void main(String[] args) {
        int numero, multiplicador, resultado = 0;

        // Coletando números.
        System.out.println("Qual o primeiro número dos que devem ser multiplicados? ");
        numero = teclado.nextInt();
        System.out.println("E o outro? ");
        multiplicador = teclado.nextInt();

        // Calculando
        if (multiplicador <= numero){
            resultado = multiplicacao(numero, multiplicador, resultado);
        }
        else{
            resultado = multiplicacao(multiplicador, numero, resultado);
        }
        System.out.println("Resultado: " + resultado + ".");
        teclado.close();
    }
}
