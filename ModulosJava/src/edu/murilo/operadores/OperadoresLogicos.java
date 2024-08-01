package edu.murilo.operadores;

public class OperadoresLogicos {
    public static void main (String[] args){
    // operadores lógicos são || (ou) && (e)

    boolean condicao1 = true;

    boolean condicao2 = false;

    String resultado = (condicao1 || condicao2) ? "As condições são diferentes" : "fim";

    System.out.println(resultado);
    }
}
