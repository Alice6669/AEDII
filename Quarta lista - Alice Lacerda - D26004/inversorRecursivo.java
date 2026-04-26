package Lista_4;
import java.util.Scanner;
public class inversorRecursivo {
    static Scanner teclado = new Scanner(System.in);
    // Fazendo método recursivo para inverter lista.
    public static int inversor(String[] lista, int indice){
        indice--;

        if (indice > 0){
            System.out.print(lista[indice] + " ");
            return inversor(lista, indice);
        }

        System.out.print(lista[indice] + " ");
        return indice;
    }

    static void main(String[] args) {
        // Coletando lista.
        String listaStr;
        System.out.println("Didite algo para ser invertido: ");
        listaStr = teclado.nextLine();

        // Invertendo.
        String lista[] = listaStr.split("");
        inversor(lista, lista.length);
        teclado.close();
    }
}
