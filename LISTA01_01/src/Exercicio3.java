import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    Float sc1 = scanner.nextFloat();
    System.out.print("Digite outro numero: ");
    Float sc2 = scanner.nextFloat();
    Float result = sc1 + sc2;
    System.out.print("O resultado da soma é: " + result);
  }
}
