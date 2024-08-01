package edu.murilo.operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1==numero2;

        System.out.println(String.format("%d é igual a %d?? %b" ,numero1 ,numero2 ,simNao));

        simNao = numero1 != numero2;

        System.out.println(String.format("%d é diferente de %d? %b" ,numero1 ,numero2 ,simNao));

        simNao = numero1 > numero2;

        System.out.println(String.format("%d é maior que %d? %b" ,numero1,numero2,simNao));

        simNao = numero1 < numero2;

        System.out.println(String.format("%d é menor que %d? %b" ,numero1,numero2,simNao));

        String nomeUm = "Murilo";
        String nomeDois = new String("Murilo");
        // ! o metodo .equals() é comparação conteudo de obejeto
        System.out.println(nomeUm.equals(nomeDois));
    }
}
