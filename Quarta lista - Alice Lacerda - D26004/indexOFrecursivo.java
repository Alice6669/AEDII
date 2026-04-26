package Lista_4;
import java.util.Scanner;
public class indexOFrecursivo {
    static Scanner teclado = new Scanner(System.in);

    // Metodo que faz o mesmo que o indexof porém recursivo.
    public static int indexofRecursivo(String[] lista, int indice, String pesquisa){
        if (indice == lista.length -1){
            return -1;
        }
        if (lista[indice].equals(pesquisa)){

            return indice;
        }

        return indexofRecursivo(lista, indice + 1, pesquisa);
    }

    static void main(String[] args) {
        String[] lista = new String[5];
        String pesquisa;
        int indice;

        // Coletando lista
        for(int numero = 0; numero < 5; numero++){
            System.out.println("O que você quer adicionar à lista? ");
            lista[numero] = teclado.nextLine();
        }

        // Coletando o que deve ser pesquisado.
        System.out.println("O que você quer procurar? ");
        pesquisa = teclado.nextLine();

        // Pesquisando.
        indice = indexofRecursivo(lista, 0, pesquisa);
        System.out.println("Indice: " + indice);
        teclado.close();
    }
}