package Lista_4;
import java.util.Scanner;
public class menorDAlistaRecursiva {
    static Scanner teclado = new Scanner(System.in);

    // Método para achar o menor valor de uma lista de forma recursiva.
    public static float procurarMenor(float[] lista, int indice, float menor){
        if (indice < lista.length){
            if (lista[indice] < menor){
                menor = lista[indice];
            }
            return procurarMenor(lista, indice + 1, menor);
        }

        return menor;
    }

    static void main(String[] args) {
        float[] lista = new float[5];
        float menor;

        // Coletando lista.
        for (int numero = 0; numero <= 4; numero++){
            System.out.println("Qual número você quer adicionar na lista? ");
            lista[numero] = teclado.nextFloat();
        }

        // Usando método.
        menor = procurarMenor(lista, 1, lista[0]);
        System.out.println("O menor da lista é: " + menor);
        teclado.close();
    }
}
