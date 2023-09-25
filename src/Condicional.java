public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2023) {
            System.out.println("Lançamento");
        }else{
            System.out.println("Filme retrô");
        }
                                // String é usado o método equals
        if(incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }

    }
}
