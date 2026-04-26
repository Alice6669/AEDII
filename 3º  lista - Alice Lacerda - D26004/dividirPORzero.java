package Lista_3;

public class dividirPORzero {

    // Metodo de divisão com preveção para divisão por zero.
    public static double divisao (int a, int b){
        if(b == 0){
            System.out.println("Erro: Divisão por zero.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        double d = divisao(4, 0);
        System.out.print(d);
    }
}
