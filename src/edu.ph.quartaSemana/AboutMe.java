public class AboutMe {
  public static void main(String[] args) {
      String nome = args[0];
      String sobrenome = args[1]; // Corrigido
      int idade = Integer.valueOf(args[2]);
      double altura = Double.valueOf(args[3]);

      System.out.println("Olá, me chamo " + nome + " " + sobrenome); // Corrigido
      System.out.println("Tenho " + idade + " anos");
      System.out.println("Minha altura é " + altura + " cm");
  }
}
