import java.util.Random;
import java.util.Scanner;
// Simular o lançamento de um dado de 6 lados.
public class LancamentoDEdado {
    static void main() {
        // Declarando variaveis.
        boolean finalizadorCodigo = true;
        String finalizadorCodigoStr;
        int numeroSorteado;
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        do {
            // Verificando se o usuário quer jogar o dado que novo.
            System.out.print("Você quer jogar o dado?(S/N) ");
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
            if (!finalizadorCodigo){
                break;
            }

            // Jogando dado.
            numeroSorteado = random.nextInt(6) + 1;

            // Mostrando resultado.
            System.out.println("Saiu: " + numeroSorteado);

        } while (finalizadorCodigo);

        // Finalizando programa.
        System.out.println("Finalizando programa.");
        teclado.close();
    }
}
