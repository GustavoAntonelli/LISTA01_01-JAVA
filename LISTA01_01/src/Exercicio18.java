import java.util.Scanner;

public class Exercicio18 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o tamanho do arquivo em MB: ");
    double tamanhoArquivo = scanner.nextDouble();
    System.out.print("Digite a velocidade do link de internet em Mbps: ");
    double velocidadeInternet = scanner.nextDouble();
    double tempoDownloadMinutos = (tamanhoArquivo * 8) / (velocidadeInternet * 60);
    System.out.printf("O tempo aproximado de download é de %.2f minutos", tempoDownloadMinutos);
  }
}
