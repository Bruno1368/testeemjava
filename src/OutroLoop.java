import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;
        // enquanto nota for diferente de -1, executar o que está no bloco while
        while (nota != -1) {
            System.out.println("Qual a sua avaliação do filme, digite uma nota de 0 a 10, ou digite -1 para encerrar: ");
            nota = leitura.nextDouble();
            // mediaAvaliacao = mediaAvaliacao + nota;
            if(nota != 1) {
                mediaAvaliacao +=  nota;
                totalNotas++;
            }

        }

        System.out.println("A média das notas é: " + mediaAvaliacao / totalNotas);
    }
}
