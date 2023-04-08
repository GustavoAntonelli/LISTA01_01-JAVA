import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um valor em metros ");
    int sc1 = scanner.nextInt();
    int sc2 = sc1 * 100;
    System.out.print("O resultado em centímetros é " + sc2);
  }
}
