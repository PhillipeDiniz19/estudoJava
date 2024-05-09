public class Usuario {
  public static void main(String[] args) throws Exception {
    Smart smart = new Smart();

    System.out.println("Tv esta ligada? " + smart.ligada);
    System.out.println("Canal atual = " + smart.canal);
    System.out.println("Volume atual: " + smart.volume);
  }
}
