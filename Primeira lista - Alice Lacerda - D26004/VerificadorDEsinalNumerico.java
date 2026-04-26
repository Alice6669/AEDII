import java.util.Scanner;

// Fazer um programa que pega um número e diz se ele é negativo, positivo ou nulo.
public class VerificadorDEsinalNumerico {
    static void main() {
        // Declarando variaveis.
        boolean finalizadorCodigo = true;
        float numero = 0;
        String sinalNumerico, numeroStr, finalizadorCodigoStr;
        Scanner teclado = new Scanner(System.in);
        do{

            // Coletando número
            System.out.print("Digite um número: ");
            do{
                numeroStr = teclado.nextLine();
                // Verificando número.
                numeroStr = numeroStr.trim();
                try{
                    numero = Float.valueOf(numeroStr);
                    break;
                }catch (NumberFormatException e){
                    System.out.println("Você deve digitar um número!");
                }
            } while (numero == 0);

            // Verificando sinal.
            if (numero == 0){
                sinalNumerico = "Nulo";
            } else {
                if(numero > 0){
                    sinalNumerico = "Positivo";
                } else {
                    sinalNumerico = "Negativo";
                }
            }

            // Dando resposta.
            System.out.println();
            System.out.println("O número " + numero + " é: " + sinalNumerico);

            // Verificando se o usuário quer testar outro número.
            System.out.print("Você quer testar outro número?(S/N) ");
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

        // Finaizando programa.
        System.out.println("Finalizando programa.");
        teclado.close();
    }
}
