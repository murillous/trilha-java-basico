public class SmartTv {
    boolean ligada = false;
    int canal = 3;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void subirCanal(){
        canal++;
    }

    public void descerCanal(){
        if(canal > 1)
           canal--;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        if(volume > 1)
            volume--;
    }
}
