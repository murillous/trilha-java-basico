package edu.murilo.tratamentoExceções;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
            try{
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");

            float altura = scanner.nextFloat();
            
            System.out.println(String.format("Olá %s %s, voce tem %d anos e %.2f metros de altura", nome, sobrenome, idade, altura));
            scanner.close();
            }
            catch(InputMismatchException e){
                System.err.println("Os campos idades e altura precisam ser numéricos");
            }
    }
}
