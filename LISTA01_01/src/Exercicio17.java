import java.util.Scanner;

public class Exercicio17 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Informe o tamanho da área a ser pintada (em metros quadrados): ");
    double area = scanner.nextDouble();
    double litros = Math.ceil(area / 6 * 1.1);
    int latas = (int) Math.ceil(litros / 18);
    int galoes = (int) Math.ceil(litros / 3.6);
    double precoLatas = latas * 80;
    double precoGaloes = galoes * 25;
    int misturaLatas = (int) (litros / 18);
    int misturaGaloes = (int) Math.ceil((litros % 18) / 3.6);
    double precoMistura = misturaLatas * 80 + misturaGaloes * 25;
    System.out.println("\nQuantidade de tinta necessária: " + litros + " litros");
    System.out.println("\nSituação 1 - Apenas latas de 18 litros:");
    System.out.println("Latas necessárias: " + latas);
    System.out.println("Preço total: R$" + precoLatas);
    System.out.println("\nSituação 2 - Apenas galões de 3,6 litros:");
    System.out.println("Galões necessários: " + galoes);
    System.out.println("Preço total: R$" + precoGaloes);
    System.out.println("\nSituação 3 - Mistura de latas e galões:");
    System.out.println("Latas necessárias: " + misturaLatas);
    System.out.println("Galões necessários: " + misturaGaloes);
    System.out.println("Preço total: R$" + precoMistura);
  }
}
