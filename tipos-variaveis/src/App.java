public class App {
    public static void main(String[] args) throws Exception {
        
        /* O valor 2.500 em double não deve ser declarado com ponto ou virgula, apenas o valor bruto. Caso o valor possua centavos, aí sim coloca-se ponto como por exemplo 2500.65 (Dois mil  e quinhentos e sessenta e cinco centavos) */
        double salarioMinimo = 2500;
        System.out.println(salarioMinimo);
        
        // Problema de tipagem: conversão de shot para int e depois de int para short.
         short numeroCurto = 1;
         int numeroNormal = numeroCurto;
         short numeroCurto2 = (short) numeroNormal;

    }
}
