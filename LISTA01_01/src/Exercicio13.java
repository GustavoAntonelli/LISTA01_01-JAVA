import java.util.Scanner;

public class Exercicio13 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a altura da pessoa (em metros): ");
    double altura = scanner.nextDouble();
    double pesoIdealM = (72.7 * altura) - 58;
    double pesoIdealF = (62.1 * altura) - 44.7;
    System.out.println("O peso ideal para homem é: " + pesoIdealM + " kg");
    System.out.println("O peso ideal para mulher é: " + pesoIdealF + " kg");
  }
}
