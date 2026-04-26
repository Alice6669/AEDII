package Lista_4;
import java.util.Scanner;
public class progressaoGeometricaRecursiva {
    static Scanner teclado = new Scanner(System.in);

    // Método recursivo para calcular uma progressão geometrica.
    public static float progressaoGeometrica(int indice, float numero, float razao){
        if (indice > 1){
            return progressaoGeometrica(indice -1, numero * razao, razao);
        }

        return numero;
    }

    static void main(String[] args) {
        int indice;
        float numero, razao, resultado;

        // Coletando os dados.
        System.out.println("Qual o primeiro termo? ");
        numero = teclado.nextFloat();
        System.out.println("Qual a razão? ");
        razao = teclado.nextFloat();
        System.out.println("Qual o indice que você quer achar? ");
        indice = teclado.nextInt();

        // Calculando.
        resultado = progressaoGeometrica(indice, numero, razao);
        System.out.println("Resultado: " + resultado);
        teclado.close();
    }
}
