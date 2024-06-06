import java.util.Scanner;

public class ContaTerminal {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        //Exibir mensagens ao usuário
        //Obter pela clase Scanner os valores digitados no terminal
        //Exibir a mensagem final acerca da conta do cliente 

        Scanner ler = new Scanner(System.in);

        int numero;
        String agencia;
        double saldo;
        String nomeCliente;
        String sobrenomeCliente;
        
        System.out.println("\n");
        System.out.println(" ------------ BEM-VINDO AO MAZEBANK ---------- ");
        System.out.println("\n O banco que você confia, sempre do seu jeito!        \n");
        System.out.println(" ----- Abra a sua conta agora e aproveite ----");
        
        System.out.print("\nInforme seu primeiro nome: ");
        nomeCliente = ler.next();

        System.out.print("Informe o seu sobrenome: ");
        sobrenomeCliente = ler.next();

        System.out.print("\nInforme o número da agência: ");
        agencia = ler.next();

        System.out.print("Informe o número da sua conta: ");
        numero = ler.nextInt();

        System.out.print("\nInforme o saldo da sua conta: ");
        saldo = ler.nextDouble();


        System.out.println("\n\n--------------- MAZEBANK INFORMA -------------- ");
        System.out.println("\nOlá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
        System.out.println("\n----------------------------------------------- ");







    }
} 
