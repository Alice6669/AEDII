import java.util.Scanner;
// Implementar um fluxograma simples.
public class VerificadorSenha {
    static void main() {
        // Declarando variaveis.
        String senha;
        boolean verificandoAcertou;
        Scanner teclado = new Scanner(System.in);

        do {
            // Coletando senha.
            System.out.print("Entre com a senha: ");
            senha = teclado.nextLine();

            if (senha.equals("alfa")) {
                System.out.println("Abrir porta");
                break;
            } else{
                System.out.println("Senha não confere.");
                verificandoAcertou = false;
            }
        } while (!verificandoAcertou);
    }
}