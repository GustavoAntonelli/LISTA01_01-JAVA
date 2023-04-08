import java.util.Scanner;

public class Exercicio8 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite quando voce ganha por hora: ");
    Float sc1 = scanner.nextFloat();
    System.out.print("Digite quantas horas voce trabalha por mes: ");
    Float sc2 = scanner.nextFloat();
    Float result = sc1 * sc2;
    System.out.print("Seu salario é de: " + result);
  }
}
