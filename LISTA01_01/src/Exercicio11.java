import java.util.Scanner;

public class Exercicio11 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o primeiro número inteiro: ");
    int n1 = scanner.nextInt();
    System.out.print("Digite o segundo número inteiro: ");
    int n2 = scanner.nextInt();
    System.out.print("Digite o número real: ");
    double nR = scanner.nextDouble();
    double a = (n1 * 2) * (n2 / 2.0);
    double b = (n1 * 3) + nR;
    double c = Math.pow(nR, 3);
    System.out.println("O produto do dobro do primeiro com metade do segundo é: " + a);
    System.out.println("A soma do triplo do primeiro com o terceiro é: " + b);
    System.out.println("O terceiro elevado ao cubo é: " + c);
  }
}
