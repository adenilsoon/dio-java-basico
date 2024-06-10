import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");

        /*analisarCandidato(1500.0);
        analisarCandidato(2000.0);
        analisarCandidato(2500.0);
        */

        selecaoCandidatos();

    }

    static void imprimirSelecionados(){
        String [] candidatos = {String [] candidatos = {"ADENILSON","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.err.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n° " + (indice+1) + " é o " + candidatos[indice]);
            
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
