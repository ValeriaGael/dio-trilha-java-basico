import javax.xml.transform.SourceLocator;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual? " + smartTv.volume);

        System.out.println("Canal atual? " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Novo canal? " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Aumentou o Canal para: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Diminuiu o Canal para: " + smartTv.canal);


        System.out.println("TV Ligada? " + smartTv.ligada);
        
        System.out.println("Volume atual? " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status TV Ligada? " + smartTv.ligada);




    }
}
