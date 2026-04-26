package Lista_5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class buscaSequencialRemover {
    static Scanner teclado = new Scanner(System.in);

    // Método de busca sequencial.
    public static void buscaSequencial(ArrayList<String> lista, String pesquisa){
        for(int numero = 0; numero <= lista.size() - 1; numero++){
            if (lista.get(numero).equalsIgnoreCase(pesquisa)){
                lista.remove(numero);
                break;
            }
        }
    }

    // Pesquisando.
    static void main(String[] args) {
        ArrayList <String> lista =  new ArrayList<>();
        String pesquisa;

        criarListaString.criarLista(lista);
        System.out.println("O que você quer remover? ");
        pesquisa = teclado.nextLine();

        buscaSequencial(lista, pesquisa);
        lerListaToda.leitorDElista(lista);
        teclado.close();
    }
}
