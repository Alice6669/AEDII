import java.util.Scanner;
// Verificar se em um email possui @ e . para saber se é válido.
public class ValidadorEmail {
    static void main() {
        // Declarando variaveis.
        int indexArroba, indexPonto;
        String email, finalizadorCodigoStr;
        boolean finalizadorCodigo = true;
        Scanner teclado = new Scanner(System.in);

        do {
            // Coletando email.
            System.out.print("Diga um email: ");
            email = teclado.nextLine();

            // Verificando se tem @.
            indexArroba = -1;
            indexArroba = email.indexOf("@");

            // Verificando se tem ponto.
             indexPonto = -1;
            indexPonto = email.indexOf(".");

            // Saida de dados.
            if (indexArroba == -1){
                System.out.println("O email não tem '@'.");
            }
            else{
                System.out.println("O email tem '@' na posição " + (indexArroba + 1) + ".");
            }

            if (indexPonto == -1){
                System.out.println("O email não tem '.'.");
            }
            else{
                System.out.println("O email tem '.' na posição " + (indexPonto + 1) + ".");
            }

            if (indexArroba == -1 || indexPonto == -1){
                System.out.println("O email é inválido.");
            }
            else{
                System.out.println("O email é válido.");
            }

            // Verificando se o usuário quer verificar outro email
            System.out.print("Você quer verificar outro email?(S/N) ");
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
