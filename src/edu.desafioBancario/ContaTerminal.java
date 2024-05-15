import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o numero da conta: ");
      int NumeroConta = scanner.nextInt();

    System.out.println("Digite o numero da agencia: ");
      String NumeroAgencia = scanner.next();

    System.out.println("Digite o nome do cliente: ");
      String NomeCliente = scanner.next();
    
    System.out.println("Digite o saldo do cliente: "); 
      double SaldoCliente = scanner.nextInt();
      
    System.out.println("Numero da conta é: " + NumeroConta);
    System.out.println("Numero da agencia é: " + NumeroAgencia);    
    System.out.println("Nome do cliente é: " + NomeCliente);  
    System.out.println("Saldo do cliente é: " + SaldoCliente);  
  }
}