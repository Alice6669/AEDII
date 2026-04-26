package Lista_4;
import java.util.Scanner;
public class divisorComSubtracaoRecursivo {
    static Scanner teclado = new Scanner(System.in);

    // Metodo para a divisão.
    public static int divisao (int divisor, int dividendo, int resultado){
        if (dividendo > 1){
            resultado++;
            return divisao(divisor, dividendo - divisor, resultado);
        }

        return resultado;
    }

    static void main(String[] args) {
        int divisor, dividendo, resultado = 0;
        // Coletando números.
        System.out.println("Qual o divisor? ");
        divisor = teclado.nextInt();
        System.out.println("Qual o dividendo? ");
        dividendo = teclado.nextInt();

        // Calculando
        resultado = divisao(divisor, dividendo, resultado);
        System.out.println("O resultado é " + resultado + ".");
        teclado.close();
    }
}
