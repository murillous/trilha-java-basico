package edu.murilo.tratamentoExceções;

public class FormatadorCep {
    public static void main(String[] args){
        try {
            String cepFormatado = formatarCep("83923454233");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep é inválido");
        }
    }
    
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 11){
            throw new CepInvalidoException();
        }

        return "839.234.542-33";
    }
}
