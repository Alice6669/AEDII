package Lista_5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class buscaSequencial {
    static Scanner teclado = new Scanner(System.in);

    // Método de busca sequencial.
    public static boolean buscaSequencial(ArrayList<String> lista, String pesquisa){
        boolean achou = false;
        for(int numero = 0; numero <= lista.size() - 1; numero++){
            if (lista.get(numero).equalsIgnoreCase(pesquisa)){
                achou = true;
                break;
            }
        }
        return achou;
    }

    // Pesquisando.
    static void main(String[] args) {
        ArrayList <String> lista =  new ArrayList<>();
        String pesquisa;
        boolean achou;

        criarListaString.criarLista(lista);
        System.out.println("O que você quer pesquisar? ");
        pesquisa = teclado.nextLine();

        achou = buscaSequencial(lista, pesquisa);
        System.out.println("Existe " + pesquisa + "? " + achou);
        teclado.close();
    }
}
