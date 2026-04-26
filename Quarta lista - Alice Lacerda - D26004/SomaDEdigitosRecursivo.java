package Lista_4;
import java.util.Scanner;
public class SomaDEdigitosRecursivo {
    static Scanner teclado = new Scanner(System.in);

    // Metodo para somar todos os digitos de um número de forma recursiva.
    public static int somaDigitos(int numero, int indice, int soma){
        String numeroStr = String.valueOf(numero);
        if (indice < numeroStr.length()){
            String [] numeroStrlista = numeroStr.split("");
            int numeroLocal = Integer.valueOf(numeroStrlista[indice]);
            indice++;
            return somaDigitos(numero, indice, soma + numeroLocal);
        }

        return soma;
    }

    static void main(String[] args) {
        int indice = 0, soma = 0, numero;

        // Coletando número.
        System.out.println("Qual número você quer somar os dígitos? ");
        numero = teclado.nextInt();

        // Calculando.
        soma = somaDigitos(numero, indice, soma);
        System.out.println("A soma é " + soma + ".");
        teclado.close();
    }
}
