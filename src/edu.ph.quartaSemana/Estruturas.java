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
    SwitcCase(args); // Chamar 4 public
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

  public static void SwitcCase(String[] args) {
    int DiaSemana = 4;

    switch (DiaSemana) {
      case 1:{
        System.out.println("Segunda-feira");
        break;
      }case 2:{
        System.out.println("Terça-feira");
        break;
      }case 4:{
        System.out.println("Quarta-feira");
        break;
      }case 5:{
        System.out.println("Quinta-feira");
        break;
      }case 6:{
        System.out.println("Sexta-feira");
        break;
      }case 7:{
        System.out.println("Sabado");
        break;
      }case 8:{
        System.out.println("Domingo");
        break;
      }
    }
  }
}
