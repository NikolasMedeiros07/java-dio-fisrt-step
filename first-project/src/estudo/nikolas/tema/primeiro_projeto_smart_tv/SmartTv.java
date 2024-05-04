package estudo.nikolas.tema.primeiro_projeto_smart_tv;

public class SmartTv {
    boolean ligada = false;
    int volume = 1;
    int canal = 1;

    public void onOff(){
        ligada = !ligada;
    }

    public void aumentarVolume(){
        if (volume == 100) {
            System.out.println("VOLUME MAXIMO");
        }else{
            volume++;
        }
    }

    public void diminuirVolume(){
        if (volume == 0) {
            System.out.println("VOLUME MINIMO");
        }else{
            volume--;
        }
    }

    public void mudaCanal(int canalNovo){
        canal = canalNovo;
    }

    public void aumentarCanal(){
        if (volume == 100) {
            System.out.println("CANAL MAXIMO");
        }else{
            volume++;
        }
    }

    public void diminuirCanal(){
        if (volume == 0) {
            System.out.println("CANAL MINIMO");
        }else{
            volume--;
        }
    }

}