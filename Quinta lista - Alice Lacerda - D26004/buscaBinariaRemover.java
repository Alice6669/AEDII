package Lista_5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class buscaBinariaRemover {
    static Scanner teclado = new Scanner(System.in);

    // Método de busca binária.
    public static void buscaBinaria(ArrayList<String> lista, String pesquisa){
        int esquerda = 0, meio, direita = lista.size() - 1;
        Collections.sort(lista);

        do{
            meio = (esquerda + direita)/ 2;

            if (lista.get(meio).equalsIgnoreCase(pesquisa)){
                lista.remove(meio);
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
    }

    // Pesquisando.
    static void main(String[] args) {
        ArrayList <String> lista =  new ArrayList<>();
        String pesquisa;

        criarListaString.criarLista(lista);
        System.out.println("O que você quer remover? ");
        pesquisa = teclado.nextLine();

        buscaBinaria(lista, pesquisa);
        lerListaToda.leitorDElista(lista);
        teclado.close();
    }
}
