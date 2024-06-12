import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        System.out.println("SISTEMA CONTADOR");
        System.out.println();

        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        
        try{
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        }catch(ArithmeticException e){
            // Imprimrir a mensagem: O segundo parâmetro deve ser maior
            System.out.println();
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois){
        // Validar de parametroUm é MAIOR que parametroDois e lançar a execução
        if (parametroUm > parametroDois) {
            throw new ArithmeticException();
        }else{
            int interacoes = parametroDois - parametroUm;

            // for para imprimir os números com base na variável contagem 
            for(int i = 0; i <= interacoes; i++){
                System.out.println(i);
            }
        }
    }
}
