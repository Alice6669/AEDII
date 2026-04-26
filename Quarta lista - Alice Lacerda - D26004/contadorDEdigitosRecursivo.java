package Lista_4;
import java.util.Scanner;
public class contadorDEdigitosRecursivo {
    static Scanner teclado =  new Scanner(System.in);

    // Metodo para contar o número de digitos de um número.
    public static int contadorDigitos(int numero, int quantDigitos){
        if (numero > 0){
            quantDigitos++;
            return contadorDigitos(numero / 10, quantDigitos);
        }

        return quantDigitos;
    }

    static void main(String[] args) {
        int numero, resultado = 0;
        // Coletando número.
        System.out.println("Qual número você quer contar os dígitos? ");
        numero = teclado.nextInt();

        // Calculando.
        resultado = contadorDigitos(numero, resultado);
        System.out.println("Número de dígitos: " + resultado);
        teclado.close();
    }
}
