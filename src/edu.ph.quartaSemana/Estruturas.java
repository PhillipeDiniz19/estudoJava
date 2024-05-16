public class Estruturas {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicitado = 17.0;

    if(valorSolicitado < saldo){
      saldo = saldo - valorSolicitado;
    }
    System.out.println("Saldo é : " + saldo);

    IfElse(args); // Chama o método IfElse
  }

  public static void IfElse(String[] args) {
    int nota = 7;

    if(nota >= 7){
      System.out.println("Aluno aprovado");
    }else{
      System.out.println("Aluno reprovado!!!");
    }
  }

  
}
