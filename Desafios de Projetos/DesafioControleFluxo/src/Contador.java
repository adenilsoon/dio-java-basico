import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        System.out.println("SISTEMA CONTADOR");
        System.out.println();

        //scanner dentro do try para que seja fechado 
        try{
            Scanner terminal = new Scanner(System.in);
            
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();

            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();
            
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidosException e){
            // Imprimrir a mensagem: O segundo parâmetro deve ser maior
            System.out.println();
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Por favor, digite apenas números inteiros válidos");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        // Validar de parametroUm é MAIOR que parametroDois e lançar a execução
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }else{
            int interacoes = parametroDois - parametroUm;

            // for para imprimir os números com base na variável contagem 
            for(int i = 1; i <= interacoes; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
