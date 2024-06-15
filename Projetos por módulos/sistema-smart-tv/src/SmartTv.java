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
        System.out.println();
        System.out.println("Desligando SmartTV... Até mais! :)");
        System.out.println();
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
        if(canal == 99){
            canal = 1;
            System.out.println("Canal alterado para " + canal);
        }else{
            canal++;
            System.out.println("Canal alterado para " + canal);
        }
    }

    public void diminuirCanal() {
        if(canal == 1){
            canal = 99;
            System.out.println("Canal alterado para " + canal);
        }else{
            canal--;
            System.out.println("Canal alterado para " + canal);
        }
    }

    public void alterarVolume(int novoVolume) {
        volume = novoVolume;
        System.out.println();
        System.out.println("Volume alterado para " + novoVolume);
    } 

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal alterado para " + novoCanal);

    }

}
