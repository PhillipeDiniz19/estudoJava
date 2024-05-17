public class Repeticao{
  public static void main(String[] args){
    for(int caneiros = 1; caneiros <= 20; caneiros++){
      System.out.println("Contando os caneiros: "+ caneiros);
    }

    String alunos [] = {"FELIPE", "DAVI", "DAVID"};

    for(int x = 0; x <= alunos.length; x++){
      if(alunos[x] == "ARTHUR"){
        System.out.println("Aluno encotrado" + x);
      }else{
        System.out.println("Aluno não encontrado");
        break;
      }
    }
  }
}