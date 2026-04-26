import java.util.Scanner;
// Coletar uma palavra e inverter ela.
public class InvertorDEpalavras {
    static void main() {
        // Declarando variaveis.
        String palavraNormal, palavraInvertida = "", finalizadorCodigoStr;
        boolean finalizadorCodigo = true;
        Scanner teclado = new Scanner(System.in);

        do {
            // Coletando palavra.
            System.out.print("Digite uma palavra ou frasse: ");
            palavraNormal = teclado.nextLine();

            // Invertendo palavra.
            String palavraSoletrada[] = palavraNormal.split("");
            palavraInvertida = "";
            for (int numero = palavraSoletrada.length - 1; numero >= 0; numero--){
                palavraInvertida += palavraSoletrada[numero];
            }

            // Dando resposta.
            System.out.println("A palavra " + palavraNormal + " invertida fica: " + palavraInvertida);

            // Verificando se o usuário quer inverter outras palavras.
            System.out.print("Você quer inverter outra palavra?(S/N) ");
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
