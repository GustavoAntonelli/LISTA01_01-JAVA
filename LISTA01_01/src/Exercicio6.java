import java.util.Scanner;

public class Exercicio6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o raio do circulo: ");
    Float raio = scanner.nextFloat();
    Double result = Math.PI * Math.pow(raio, 2);
    System.out.printf("O resultado da soma é: %.2f", result);
  }
}
