import java.util.Scanner;
// Calcular o fatorial de um número dado pelo usuário.
public class Fatorial {
    static void main() {
        // Declarando variaveis.
        int fatorial = 0, fatorialResultado = 1;
        String fatorialStr, finalizadorProgramaStr;
        boolean finalizadorPrograma = true;
        Scanner teclado = new Scanner(System.in);

        do {
            // Coletando número e o validando.
            System.out.print("Digite um número inteiro: ");
            do {
                fatorialStr = teclado.nextLine();
                fatorialStr = fatorialStr.trim();
                try {
                    fatorial = Integer.valueOf(fatorialStr);
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Número inválido, digite novamente!");
                }
            } while (fatorial == 0);

            // Calculando fatorial.
            fatorialResultado = 1;
            for (int numero = fatorial; numero > 1; numero--){
                fatorialResultado *= numero;
            }

            // Dando resposta.
            System.out.println("O fatorial de " + fatorial +" é " + fatorialResultado);

            // Verificando se o usuário quer calcular outros fatoriais.
            System.out.print("Você quer calcular outro fatorial?(S/N) ");
            do{
                finalizadorProgramaStr = teclado.nextLine();
                if (finalizadorProgramaStr.equalsIgnoreCase("N")){
                    finalizadorPrograma = false;
                } else {
                    if (finalizadorProgramaStr.equalsIgnoreCase("S")){
                        finalizadorPrograma = true;
                    }
                    else{
                        System.out.println("Digite S para sim e N para não!");
                    }
                }
            } while (!finalizadorProgramaStr.equalsIgnoreCase("N") &&
                    !finalizadorProgramaStr.equalsIgnoreCase("S"));
        } while (finalizadorPrograma);

        // Finalizando programa.
        System.out.println("Finalizando programa.");
        teclado.close();
    }
}
