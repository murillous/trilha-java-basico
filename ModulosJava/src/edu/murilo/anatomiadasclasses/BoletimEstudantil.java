package edu.murilo.anatomiadasclasses;
public class BoletimEstudantil {
    
    public static void main(String[] args) {
        int mediaFinal = 9;
        if (mediaFinal < 6) 
            System.out.println("Reprovado");
        else if(mediaFinal == 6) 
            System.out.println("Prova mediocre");
        else 
            System.out.println("Aprovado");
        
    }
}
