package edu.murilo.operadores;

public class Ternario {
    public static void main (){
        int a = 5;
        int b = 5;

        int resultado = a==b ? a-b : b+a;

        System.out.println(resultado);
    }
}
