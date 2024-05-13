public class Comentarios {
  public static void main(String[] args) {
      // Comentário em uma única linha.
      
      /* 
       * Comentário em bloco.
       */
      
      /**
       * Estas duas estrelas significam que você quer fazer um 
       * comentário para identificar que pretende elaborar
       * um comentário a nível de documentação.
       */
  }
  
  /**
   * Este método foi elaborado às pressas,
   * por isso abreviei o nome das variáveis,
   * mas olha, ele tem a finalidade de somar ou multiplicar
   * dois números.
   */
  public int somaMultiplica(int n, int x, String m) {
      int r = 0; // r é igual ao resultado
      if (m.equals("M")) { // M = multiplicação
          r = n * x;
      } else {
          // se não, soma mesmo
          r = n + x;
      }
      return r;
  }
}
