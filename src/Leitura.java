import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite seu filme favorito: " );
        String filmeFavorito = leitura.nextLine();


        System.out.println("Ano de lançamento do filme: ");
        int anoLancamento = leitura.nextInt();

        System.out.println("Qual a sua avaliação do filme, digite uma nota de 0 a 10: ");
        double notaFilme = leitura.nextDouble();

        System.out.println(filmeFavorito);
        System.out.println(anoLancamento);
        System.out.println(notaFilme);

    }

}
