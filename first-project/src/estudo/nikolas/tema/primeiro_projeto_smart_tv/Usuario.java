package estudo.nikolas.tema.primeiro_projeto_smart_tv;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.onOff();
        System.out.println("a tv está ligada? " + smartTv.ligada);

        System.out.println(smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);

        System.out.println(smartTv.canal);
        smartTv.mudaCanal(20);
        System.out.println(smartTv.canal);
    }
}
