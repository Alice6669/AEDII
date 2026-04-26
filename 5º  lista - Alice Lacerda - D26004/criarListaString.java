package Lista_5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class criarListaString {
    static Scanner teclado = new Scanner(System.in);

    // Método para criar lista.
    public static ArrayList<String>  criarLista(ArrayList<String> lista){
        String nome;
        do {
            System.out.println("O que você quer adicionar à lista?(digite STOP para parar) ");
            nome = teclado.nextLine();
            nome = nome.trim();
            if (nome.equals("STOP")){
                break;
            }
            lista.add(nome);
        } while (!nome.equals("STOP"));
        return lista;
    }

    // Usando método.
    static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        criarLista(lista);
        teclado.close();
    }
}
