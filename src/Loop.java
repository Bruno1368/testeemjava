import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
                             // i = i + 1/
        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a sua avaliação do filme, digite uma nota de 0 a 10: ");
            nota = leitura.nextDouble();
                    // mediaAvaliacao = mediaAvaliacao + nota;
            mediaAvaliacao +=  nota;
        }

        System.out.println("A média de avaliações do filme é: " + mediaAvaliacao / 3);






    }
}
