package Lista_5;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class buscaBinaria {
    static Scanner teclado = new Scanner(System.in);

    // Método de busca binária.
    public static boolean buscaBinaria(ArrayList<String> lista, String pesquisa){
        boolean achou = false;
        int esquerda = 0, meio, direita = lista.size() - 1;
        Collections.sort(lista);

        do{
            meio = (esquerda + direita)/ 2;

            if (lista.get(meio).equalsIgnoreCase(pesquisa)){
                achou = true;
                break;
            }
            else {
                if(lista.get(meio).compareTo(pesquisa) > 0){
                    direita = meio - 1;
                }
                else {
                    esquerda = meio + 1;
                }
            }
        } while (esquerda <= direita);

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

        achou = buscaBinaria(lista, pesquisa);
        System.out.println("Existe " + pesquisa + "? " + achou);
        teclado.close();
    }
}

