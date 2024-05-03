import java.util.Scanner;

public class informacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.println("Digite o segundo primeiro: ");
          final int informacao = scanner.nextLine();
          System.out.println("Digite o segundo numero: ");
          final int informacaoDois = scanner.nextLine();
          int resultado = informacao + informacaoDois;
          System.out.println("A soma dos dois numeros é: " + informacao );

        scanner.close();
    }
}
