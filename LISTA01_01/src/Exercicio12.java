import java.util.Scanner;

public class Exercicio12 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a altura da pessoa (em metros): ");
    double altura = scanner.nextDouble();
    double pesoIdeal = (72.7 * altura) - 58;
    System.out.println("O peso ideal da pessoa é: " + pesoIdeal + " kg");
  }
}
