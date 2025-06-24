import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // de 1 a 100
        int tentativas = 0;
        int chute = 0;

        System.out.println("=== Jogo de Adivinhação ===");
        System.out.println("Tente adivinhar o número entre 1 e 100!");

        while (chute != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            chute = scanner.nextInt();
            tentativas++;

            if (chute < numeroSecreto) {
                System.out.println("Muito baixo! Tente um número maior.");
            } else if (chute > numeroSecreto) {
                System.out.println("Muito alto! Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        }
    }
}
