import java.util.Scanner;

public class Exercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a nota do primeiro bimestre: ");
    Float sc1 = scanner.nextFloat();
    System.out.print("Digite a nota do segundo bimestre: : ");
    Float sc2 = scanner.nextFloat();
    System.out.print("Digite a nota do terceiro bimestre: : ");
    Float sc3 = scanner.nextFloat();
    System.out.print("Digite a nota do quarto bimestre: : ");
    Float sc4 = scanner.nextFloat();
    Float soma = sc1 + sc2 + sc3 + sc4;
    Float result = soma / 4;
    System.out.print("A média das notas é de: " + result);
  }
}
