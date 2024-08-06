package edu.murilo.estruturascondicionais;

public class SistemaMedida {
    
   public static void main(String[] args) {
        //String sigla = "P";

        // switch (sigla) {
        //     case "P":
        //         System.out.println("Tamanho Pequeno");
        //         break;
        //     case "M":
        //         System.out.println("Tamanho Médio");
        //         break;
        //     case "G":
        //         System.out.println("Tamanho Grande");
        //         break;
        //     default:
        //         System.out.println("Tamanho indefinido");
        //         break;
        // }
        String plano = "T";

        switch (plano) {
            case "T":
                System.out.println("5Gb Youtube");
            case "M":
                System.out.println("Whats e instagram grátis");
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            default:
                System.out.println("Esse plano não existe!");   
        }
    }
}