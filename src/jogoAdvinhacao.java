import java.util.Random;
import java.util.Scanner;

public class jogoAdvinhacao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int tentativas = 0;
        int numeroAleatorio = random.nextInt(100);

        while (tentativas < 5) {
            System.out.println("Digite um número de 1 a 100");
            int numeroDigitado = scan.nextInt();

            if(numeroDigitado == numeroAleatorio){
                System.out.println("Parabéns, você acertou o número aleatório");
                break;
            }else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número aleatório é maior que:" + numeroDigitado);
            }else{
                System.out.println("O número aleatório é menor que: " + numeroDigitado);
            }
            tentativas++;
        }

        if(tentativas == 5){
            System.out.println("Sinto muito, mas você não adivinhou o número correto, o número era: " + numeroAleatorio);
        }

    }

}
