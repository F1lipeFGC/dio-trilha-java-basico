public class usuario{

    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();


        smartTv.mudarCanal(14);
        System.out.println("Canal Atual :" + smartTv.canal);

        System.out.println("Volume Atual :" + smartTv.volume);


        System.out.println("TV está Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);


        smartTv.ligar ();
        System.out.println("Novo status -> TV está Ligada ?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV está desligada ?" + smartTv.ligada);
    
        
    
    
    }



    
}

