package Lista_3;

public class fatorialCOMlimite20 {
    // Metodo para calcular o fatorial que seja menor ou igual a 20.
    public static long fatorial (int numero){
        if (numero > 20){
            System.out.println("Não aceitamos fatoriais maiores que 20.");
            return 0;
        }
        int resultado = 1;
        for (numero = numero; numero >= 1; numero--){
            resultado *= numero;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(fatorial(21));
    }
}
