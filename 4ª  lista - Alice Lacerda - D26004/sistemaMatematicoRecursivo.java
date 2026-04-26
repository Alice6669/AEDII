package Lista_4;
import java.util.Scanner;
public class sistemaMatematicoRecursivo {
    static Scanner teclado = new Scanner(System.in);

    // Método para resolver o sistema matemático de forma recursiva.
    public static int sistemaMatematico(int indice){
        if (indice == 0){
            return 1;
        }
        if (indice == 1){
            return 2;
        }
        return (sistemaMatematico(indice - 1) * sistemaMatematico(indice - 2) - sistemaMatematico(indice - 1));
    }

    public static void main(String[] args) {
        int indice, resultado;

        // Coletando indice
        System.out.println("Qual o indice que você quer achar? ");
        indice = teclado.nextInt();

        // Calculando.
        resultado = sistemaMatematico(indice);
        System.out.println("O resultado é " + resultado + ".");
        teclado.close();
    }
}
