import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Digite o primeiro número (dividendo): ");
                int dividendo = scanner.nextInt();

                System.out.print("Digite o segundo número (divisor): ");
                int divisor = scanner.nextInt();

                if (dividendo == 0 && divisor == 0) {
                    System.out.println("Encerrando programa.");
                    break;
                }
                int calculo = dividendo / divisor;

                System.out.println("O resultado é: " + calculo);
            }
            catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero não pode.");
            }
          catch(InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
                    scanner.nextLine();
                }
                System.out.println();
        }
        scanner.close();
    }
}