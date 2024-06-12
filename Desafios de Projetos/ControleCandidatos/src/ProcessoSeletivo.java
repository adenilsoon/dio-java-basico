import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("PROCESSO SELETIVO");
        System.out.print("\n");

        String [] candidatos = {"ADENILSON","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidadto: candidatos){
            entrandoEmContato(candidadto);
        }

        /*analisarCandidato(1500.0);
        analisarCandidato(2000.0);
        analisarCandidato(2500.0);
        */

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        } while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª TENTATIVA");
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
        }
            
    }
    

    //método auxiliar
    static boolean atender(){
        //Irá gerar um número randomizado entre 1 e 3 e caso o número gerado seja igual a 1 isso significada que o candidato atendeu a ligação
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"ADENILSON","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.err.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato(a) de n° " + (indice+1) + " é o " + candidatos[indice]);
            
        }
        System.out.println("Forma abreviada de interação (sem apresentar o índice): for each");
        
        for(String candidato: candidatos){
            System.out.println("O candidato(a) selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"ADENILSON","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados <= 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato(a) " + candidatoAtual + " solicitou esse valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato(a) " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
