import java.util.Scanner;

public class Exercicio10 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a temperatura em graus Celsius: ");
    double c = scanner.nextDouble();
    double F = (c * 1.8) + 32;
    System.out.println("A temperatura em graus Fahrenheit é: " + F);
  }
}
