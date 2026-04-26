package Lista_5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class buscaSequencialRecursiva {
    static Scanner teclado = new Scanner(System.in);

    // Método recursivo de busca sequencial.
    public static boolean buscSequenRecur(ArrayList <String> lista, String pesquisa, int indice){

        if (indice == lista.size()){
            return false;
        }
        if (!lista.get(indice).equalsIgnoreCase(pesquisa)){
            return buscSequenRecur(lista, pesquisa, indice + 1);
        }

        return true;
    }

    // Pesquisando.
    static void main(String[] args) {
        ArrayList <String> lista =  new ArrayList<>();
        String pesquisa;
        boolean achou;

        criarListaString.criarLista(lista);
        System.out.println("O que você quer pesquisar? ");
        pesquisa = teclado.nextLine();

        achou = buscSequenRecur(lista, pesquisa, 0);
        System.out.println("Existe " + pesquisa + "? " + achou);
        teclado.close();
    }
}
