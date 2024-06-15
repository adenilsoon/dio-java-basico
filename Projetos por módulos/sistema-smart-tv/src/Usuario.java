import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Usuario {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner ler = new Scanner(System.in);
        SmartTv smartTv = new SmartTv();
        int opcaoMenu;

        System.out.println("Nesse momento a TV encontra-se " + smartTv.statusTV());
        System.out.println("Atualmente você está assistindo ao canal " + smartTv.canal + " com o volume ajustado no " + smartTv.volume);
        
        while (smartTv.ligada == true) {
        System.out.printf("\nSelecione abaixo alguma opção: \n\n 1 - Ajustar volume \n 2 - Selecionar canal \n 3 - Avançar canal \n 4 - Voltar canal \n 5 - Aumentar volume \n 6 - Diminuir volume \n 7 - Desligar TV\n\n>>> ");
        opcaoMenu = ler.nextInt();

        switch (opcaoMenu) {
            case 1:
                System.out.printf("Informe o número para o qual o volume deverá ser alterado: ");
                smartTv.novoVolume = ler.nextInt();
                smartTv.alterarVolume(smartTv.novoVolume);
                break;
            
            case 2:
                System.out.printf("Informe o canal que você deseja assistir: ");
                smartTv.novoCanal = ler.nextInt();
                
                smartTv.mudarCanal(smartTv.novoCanal);
                break;

            case 3:
                smartTv.aumentarCanal();
                break;

            case 4:
                smartTv.diminuirCanal();
                break;

            case 5:
                smartTv.aumentarVolume();
                break;

            case 6:
                smartTv.diminuirVolume();
                break;

            case 7:
                smartTv.desligar();
                break;

            default:
                System.out.println("Hmm, opção indisponível. Visualize na tela as opções e selecione um número entre 1 e 5.");
                break;
             }
        }

        
        /*smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(28);

        System.out.println("A sua SmartTV está " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("A sua SmartTV está " + smartTv.ligada);
        */

    }
}
