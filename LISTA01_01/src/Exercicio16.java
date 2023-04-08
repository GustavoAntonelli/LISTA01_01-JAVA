import java.util.Scanner;

public class Exercicio16 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a altura: ");
    Float altura = scanner.nextFloat();
    System.out.print("Digite a largura: ");
    Float largura = scanner.nextFloat();
    Float area = altura * largura;
    area = area * 2;
    Float latasDeTinta = area / 3;
    latasDeTinta = latasDeTinta / 18;
    Float valor = latasDeTinta * 80;
    System.out.printf("A quantidade de latas de tinta a serem usadas é de: %.2f", latasDeTinta);
    System.out.printf("\nO valor total a ser pago é de:  %.2f", valor);
  }
}
