import java.util.Scanner;

public class MinhaClasse {
public static void main(String[] args) {
    
    try (// Instanciando e criando um objeto Scanner
    Scanner ler = new Scanner(System.in)) {
        String primeiroNome;
        String sobrenome;

        System.out.print("Informe apenas o seu PRIMEIRO nome: ");
        primeiroNome = ler.nextLine();

        System.out.print("Informe agora o seu SOBRENOME: ");
        sobrenome = ler.nextLine();

        String nomeCompleto = nomeCompleto (primeiroNome, sobrenome);
        System.out.println(nomeCompleto);
    }

}

public static String nomeCompleto (String primeiroNome, String sobrenome) {
    return "Este é o seu nome completo: " + primeiroNome.concat(" ").concat(sobrenome);
}

}
