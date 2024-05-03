import java.util.Scanner;

public class informacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int informacao = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Digite o segundo número: ");
        int informacaoDois = Integer.parseInt(scanner.nextLine());
        
        int resultado = informacao + informacaoDois;
        
        System.out.println("A soma dos dois números é: " + resultado);

        scanner.close();
    }
}
