import java.util.Scanner;

public class Exercicio15 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Informe o valor da hora trabalhada: R$ ");
    double valorHora = scanner.nextDouble();
    System.out.print("Informe o número de horas trabalhadas no mês: ");
    double horasTrabalhadas = scanner.nextDouble();
    double salarioBruto = valorHora * horasTrabalhadas;
    double ir = 0.11 * salarioBruto;
    double inss = 0.08 * salarioBruto;
    double sindicato = 0.05 * salarioBruto;
    double descontos = ir + inss + sindicato;
    double salarioLiquido = salarioBruto - descontos;
    System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
    System.out.printf("Desconto do IR (11%%): R$ %.2f\n", ir);
    System.out.printf("Desconto do INSS (8%%): R$ %.2f\n", inss);
    System.out.printf("Desconto do Sindicato (5%%): R$ %.2f\n", sindicato);
    System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);
  }
}
