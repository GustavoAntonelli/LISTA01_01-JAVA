import java.util.Scanner;

public class Exercicio9 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a temperatura em Fahrenheit: ");
    Float F = scanner.nextFloat();
    int c = (int) (5 * ((F - 32) / 9));
    System.out.print("Digite a temperatura em graus Celsius é de: " + c);
  }
}
