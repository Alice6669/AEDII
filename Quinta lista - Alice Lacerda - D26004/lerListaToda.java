package Lista_5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class lerListaToda {
    static Scanner teclado = new Scanner(System.in);

    // Método para ler uma lista.
    public static void leitorDElista(ArrayList<String> lista){
        for (int numero = 0; numero <= lista.size() -1; numero++){
            System.out.println(lista.get(numero));
        }
    }

    static void main() {
        ArrayList <String> lista = new ArrayList<>();
        criarListaString.criarLista(lista);
        leitorDElista(lista);
        teclado.close();
    }
}
