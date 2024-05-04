package estudo.nikolas.tema.tipos_de_operadores;

public class Ternario {
    public static void main(String[] args) throws Exception {
        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        int resultado = (a==b) ? 1 : 0;

        System.out.println(resultado);
    } 
}
