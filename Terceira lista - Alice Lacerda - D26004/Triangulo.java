package Lista_3;

public class Triangulo {
    // Metodo para distinguir se o triângulo existe e se é um escaleno, equilátero ou isósceles
    public static int  determinarTipo(float catetoA, float catetoB, float catetoC){
        // Validando triangulo lados do triângulo.
        if (catetoA <= 0 || catetoB <= 0 || catetoC <= 0){
            System.out.println("Os lados do triangulo devem ser maiores que zero.");
            return -1;
        }

        // Validando trângulo, cada lado deve ser menor que a soma dos outros dois.
        if (catetoA >= catetoB + catetoC){
            System.out.println("O cateto A não pode ser maior que o B mais o C.");
            return -1;
        }
        if (catetoB >= catetoA + catetoC){
            System.out.println("O cateto B não pode ser maior que o A mais o C.");
            return -1;
        }
        if (catetoC >= catetoB + catetoA){
            System.out.println("O cateto C não pode ser maior que o B mais o A.");
            return -1;
        }

        // Triângulo equilátero.
        if (catetoA == catetoB && catetoB == catetoC){
            return 0;
        }

        // Triângulo isósceles.
        if (catetoA == catetoB || catetoA == catetoC || catetoB == catetoC){
            return 1;
        }

        return 2;
    }

    // Decifrando o resultado.
    public static void decifradorDEindice(int indice){
        switch (indice){
            case -1:
                System.out.println("Erro.");
                break;
            case 0:
                System.out.println("Equilátero.");
                break;
            case 1:
                System.out.println("Isósceles.");
                break;
            case 2:
                System.out.println("Escaleno.");
                break;
        }
    }

    public static void main(String[] args){
        int indice;
        // Inválido por lado
        indice = determinarTipo(-1, 2, 2);
        decifradorDEindice(indice);
        // Inválido por triângulo
        indice = determinarTipo(2, 15, 2);
        decifradorDEindice(indice);
        // Equilátero.
        indice = determinarTipo(10, 10, 10);
        decifradorDEindice(indice);
        // Isósceles.
        indice = determinarTipo(3, 4, 3);
        decifradorDEindice(indice);
        // Escaleno.
        indice = determinarTipo(3, 4, 5);
        decifradorDEindice(indice);
    }
}
