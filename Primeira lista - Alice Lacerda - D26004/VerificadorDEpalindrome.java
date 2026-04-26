import java.util.Scanner;
// Verificar se uma palavra é palindrome, ou seja se pode ser
// lida da mesma forma de trás para frente.
public class VerificadorDEpalindrome {
    static void main() {
        // Declarando variaveis.
        boolean finalizadorCodigo = true, verificadorPalindrome;
        int contadorMetadePalavra;
        String palavraInteira, finalizadorCodigoStr;
        Scanner teclado = new Scanner(System.in);

        do {
            // Coletando palavra.
            System.out.print("Digite uma palavra: ");
            palavraInteira = teclado.nextLine();
            palavraInteira = palavraInteira.trim();

            // Verificando se é palindrome.
            String palavraSoletrada[] = palavraInteira.split("");
            if (palavraSoletrada.length % 2 != 0){
                contadorMetadePalavra = palavraSoletrada.length - 1;
            }
            else {
                contadorMetadePalavra = palavraSoletrada.length;
            }
            contadorMetadePalavra = contadorMetadePalavra / 2;
            verificadorPalindrome = true;
            for (int numero = 0; numero < contadorMetadePalavra; numero ++){
                if(!palavraSoletrada[numero].equalsIgnoreCase(palavraSoletrada[
                        palavraSoletrada.length - numero - 1])){
                    verificadorPalindrome = false;
                    break;
                }
            }

            // Dando resposta.
            if(verificadorPalindrome){
                System.out.println("A palavra " + palavraInteira + " é um palindrome.");
            }
            else{
                System.out.println("A palavra " + palavraInteira + " não é um palindrome.");
            }

            // Verificando se o usuário quer verificar outras palavras.
            System.out.print("Você quer verificar se outra palavra é um palindrome?(S/N) ");
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
