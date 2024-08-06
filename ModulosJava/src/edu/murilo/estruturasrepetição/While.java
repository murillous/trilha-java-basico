package edu.murilo.estruturasrepetição;

public class While {
    public static void main(String[] args) {
        double mesada = 50;

        while(mesada > 0){
            Double valorDoce = Math.random() * 8;

            if(mesada < valorDoce){
                mesada = valorDoce;
            }

            System.out.println(String.format("Doce do Valor %.2f foi adicionado ao carrinho", valorDoce));
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
}
