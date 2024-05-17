import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


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
    RepeticaoWhile(args);
    usaDoWhile(args);
  }

  public static void RepeticaoWhile(String[] args) {
    double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */
   }
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8);
  }

  public static void usaDoWhile(String[] args) {
    System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}
