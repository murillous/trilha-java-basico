package edu.murilo.operadores;

public class OperadoresAritmeticos {
    
    public static void main (String[] args){
        float n1 = 10.4f;
        float n2 = 43.53f;
        float soma = n1 + n2;
        float subtracao = n1 - n2;
        float multiplicacao = n1 * n2;
        float divisao = n1 / n2;
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

        String concatenacao = "?";
        
        System.out.println(concatenacao);
        
        concatenacao = 1 + 1 + 1 + "1";
        
        System.out.println(concatenacao);
        
        concatenacao = 1 + "1" + 1 + 1;
        
        System.out.println(concatenacao);
        
        concatenacao = 1 + "1" + 1 + "1";
        
        System.out.println(concatenacao);
        
        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        byte numero = 1;

        System.out.println(numero);
        
        numero += 1;

        System.out.println(numero);

        numero++;

        System.out.println(numero);

        boolean variavel = true;

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);
    }
}
