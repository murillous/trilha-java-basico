public class MinhaClasse{
// ! variaveis em maisculo são constantes e possuem a palavra "final"
// ! antes da declaração
    public static void main (String [] args) {
        final String BR = "Brasil";
        final Double PI = 3.14;
        String textoMutavel = "Testando Mutabilidade";
        System.out.println(BR);
        System.out.println(PI);
        System.out.println(textoMutavel);
        
        textoMutavel = "Mudei tudo otário";
        System.out.println(textoMutavel);
    
    }
}