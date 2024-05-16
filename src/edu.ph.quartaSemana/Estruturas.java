public class Estruturas {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicitado = 17.0;

    if(valorSolicitado < saldo){
      saldo = saldo - valorSolicitado;
    }
    System.out.println("Saldo é : " + saldo);

    IfElse(args); // Chama o método IfElse
    Ternario(args); // Chamar 3 public
  }

  public static void IfElse(String[] args) {
    int nota = 4;

    if(nota >= 7){
      System.out.println("Aluno aprovado");
    }else if(nota < 7 && nota >= 5){
      System.out.println("Aluno de recuperação");
    }else{
      System.out.println("Aluno reprovado!!!");
    }
  }

  public static void Ternario(String[] args) {
      int notaUm = 4;
      String resultado = notaUm >= 7 ? "aprovado" : "Reprovado";
      String resultadoDois = notaUm >= 7 ? "aprovado" : notaUm >= 5 && notaUm < 7 ? "Recuperação" : "Reprovado" ;
      System.out.println(resultado);
      System.out.println(resultadoDois);
  }
}
