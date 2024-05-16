import java.util.Scanner;
import java.io.IOException;

public class SmartTv {
    
    boolean ligada = true;
    int canal = 1;
    int volume = 20;
    int novoCanal;
    int novoVolume;

    public String statusTV () {
        ligada = true;
        return "ligada!";
    }

    public void ligar()  {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
        System.out.println("Desligando SmartTV... Até mais! :)");
    }

    public void aumentarVolume() {
        if (volume == 100) {
            System.out.println("\n100 é o volume máximo");
        } 
        else {
            volume++;
            System.out.println("Aumentando volume para " + volume);
        }
    }

    public void diminuirVolume() {
        if (volume == 0) {
            System.out.println("0 é o volume minímo. A TV está em MUDO!");
        }   
        else {
            volume--;
            System.out.println("Diminuindo volume para " + volume);
        }
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Aumentando canal para " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo canal para " + canal);
    }

    public void alterarVolume(int novoVolume) {
        volume = novoVolume;
        System.out.println("Volume alterado para " + novoVolume);
    } 

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal alterado para " + novoCanal);

    }


    


}
