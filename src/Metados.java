public class Metados {
  public static void main(String[] args) {
    String primeiroNome = "Phillipe";
    String segundoNome = "Diniz";
    int idade = 19;

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, idade);
    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome, int idade) {
    return primeiroNome.concat(" ").concat(segundoNome).concat(" Sua idade: ") + idade ; // concat "super metado" que junta o 1 com 2.
  }
}
