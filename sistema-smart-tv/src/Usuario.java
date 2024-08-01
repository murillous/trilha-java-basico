public class Usuario {
    
    public static void main(String[] args){

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.descerCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(6);
        System.out.println("Canal Atual: " + smartTv.canal);

    }
}
