import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Coletar uma lista de numeros de tamanho inderterminado e
// depois dizer qual o menor e o maior desse número.
public class MaiorEmenorValorLista {
    static void main() {
        // Declarando variaveis.
        String numeroStr, finalizadorCodigoStr;
        boolean finalizadorCodigo = true;
        int contador;
        float menorNumero = 0, maiorNumero = 0;
        List <Float> numeros = new ArrayList<Float>();
        Scanner teclado = new Scanner(System.in);

        do {
            // Coletando e validando números.
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

            // Procurando menor número.
            for (int numero = 0; numero < numeros.size(); numero++){
                if (numero == 0) {
                    menorNumero = numeros.get(numero);
                } else{
                    if (numeros.get(numero) < menorNumero){
                        menorNumero = numeros.get(numero);
                    }
                }
            }

            // Procurando maior número.
            for (int numero = 0; numero < numeros.size(); numero++){
                if (numero == 0) {
                    maiorNumero = numeros.get(numero);
                } else{
                    if (numeros.get(numero) > menorNumero){
                        maiorNumero = numeros.get(numero);
                    }
                }
            }

            // Dando resposta.
            System.out.println("O menor número da lista é: " + menorNumero);
            System.out.println("O maior número da lista é: " + maiorNumero);

            // Verificando se o usuário quer verificar outros números.
            System.out.print("Você quer calcular outro fatorial?(S/N) ");
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
