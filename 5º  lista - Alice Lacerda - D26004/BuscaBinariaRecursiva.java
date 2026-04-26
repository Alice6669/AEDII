package Lista_5;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class BuscaBinariaRecursiva {
    static Scanner teclado = new Scanner(System.in);

    // Método recursivo para busca binária.
    public static boolean buscBinRecur(ArrayList<String> lista, String pesquisa, int esquerda, int direita) {
        int meio = (esquerda + direita) / 2;
        Collections.sort(lista);

        if (esquerda > direita) {
            return false;
        }

        if (lista.get(meio).compareTo(pesquisa) > 0) {
            return buscBinRecur(lista, pesquisa, esquerda, meio - 1);
        }

        if (lista.get(meio).compareTo(pesquisa) < 0) {
            return buscBinRecur(lista, pesquisa, meio + 1, direita);
        }

        return true;
    }

    // Pesquisando.
    static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        String pesquisa;
        boolean achou;

        criarListaString.criarLista(lista);
        System.out.println("O que você quer pesquisar? ");
        pesquisa = teclado.nextLine();

        achou = buscBinRecur(lista, pesquisa, 0, lista.size() - 1);
        System.out.println("Existe " + pesquisa + "? " + achou);
        teclado.close();
    }
}
