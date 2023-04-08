import java.util.Scanner;

public class Exercicio14 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o peso de peixes trazido por João (em quilos): ");
    double peso = scanner.nextDouble();
    double excesso = peso - 50;
    double multa = excesso * 4;
    System.out.println("O peso de peixes trazido por João foi de: " + peso + " kg");
    System.out.println("João excedeu o limite de peso em: " + excesso + " kg");
    System.out.println("João terá que pagar uma multa de R$ " + multa);
  }
}
