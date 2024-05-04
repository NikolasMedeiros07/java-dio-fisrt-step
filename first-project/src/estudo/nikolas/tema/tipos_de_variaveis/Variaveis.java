package estudo.nikolas.tema.tipos_de_variaveis;

public class Variaveis {
    public static void main(String[] args) throws Exception {
        
        String meuNome = "Nikolas Medeiros";
        System.out.println(meuNome);
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2); 
        
        final double PI = 3.14;
        System.out.println(PI); 
    }
}
