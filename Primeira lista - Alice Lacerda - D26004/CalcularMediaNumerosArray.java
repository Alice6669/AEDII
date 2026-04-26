import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Receber um número indeterminado de números do usuário e calcular a média deles.
public class CalcularMediaNumerosArray {
    static void main() {
        // Declarando variaveis.
        List <Float> numeros = new ArrayList<Float>();
        String numeroStr, finalizadorCodigoStr;
        float soma, media;
        int contador = 1;
        boolean finalizadorCodigo = true;
        Scanner teclado = new Scanner(System.in);

        do {
            // Coletando numeros e os validando.
            numeros.clear();
            contador = 1;
            do {
                System.out.print("Digite o " + contador + "º " +
                        "número:(digite X para parar) ");
                do {
                    numeroStr = teclado.nextLine();
                    numeroStr = numeroStr.trim();
                    if (numeroStr.equalsIgnoreCase("X")){
                        break;
                    }
                    try {
                        numeros.add(Float.valueOf(numeroStr));
                        break;
                    } catch (NumberFormatException e){
                        System.out.println("Valor inválido, digite novamente!");
                    }
                } while (!numeroStr.equalsIgnoreCase("X"));
                contador++;
            } while (!numeroStr.equalsIgnoreCase("X"));

            // Calculando média.
            soma = 0;
            for (int numero = 0; numero < numeros.size(); numero++){
                soma += numeros.get(numero);
            }
            media = soma / numeros.size();

            // Dando resposta.
            System.out.println("A media desses números é: " + media);

            // Verificando se o usuário quer calcular outra média
            System.out.print("Você quer calcular a media de outra lista?(S/N) ");
            do{
                finalizadorCodigoStr = teclado.nextLine();
                if (finalizadorCodigoStr.equalsIgnoreCase("N")){
                    finalizadorCodigo = false;
                } else {
                    if (finalizadorCodigoStr.equalsIgnoreCase("S")){
                        finalizadorCodigo = true;
                    }
                    else{
                        System.out.println("Digite S para sim e N para não!");
                    }
                }
            } while (!finalizadorCodigoStr.equalsIgnoreCase("N") &&
                    !finalizadorCodigoStr.equalsIgnoreCase("S"));
        } while (finalizadorCodigo);

        // Finalizando programa.
        System.out.println("Finalizando programa.");
        teclado.close();
    }
}
