import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Informe o valor que deseja sacar: ");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // TODO: Imprimir "Transação realizada com sucesso."
            System.out.println("Transacao realizada com sucesso.");
        } else{
          // TODO: Verificar se o saque ultrapassa o saldo + limite do cheque especial
          // Em caso positivo, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
          if(saque > (saldo+limiteChequeEspecial)){
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
          }else{
            // Caso contrário, imprimir "Transacao realizada com sucesso utilizando o cheque especial.."
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
          }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
