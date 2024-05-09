public class Usuario {
  public static void main(String[] args) throws Exception {
    Smart smart = new Smart();

    System.out.println("Tv esta ligada? " + smart.ligado);
    System.out.println("Canal atual = " + smart.canal);
    System.out.println("Volume atual: " + smart.volume);

    smart.Ligar();

    System.out.println("Tv esta ligada? " + smart.ligado);

    smart.Desligar();

    System.out.println("Tv esta ligada? " + smart.ligado);

    smart.AumentarVolume();
    smart.AumentarVolume();
    smart.AumentarVolume();
    smart.DiminuirVolume();

    smart.AumentarCanal();
    smart.DiminuirCanal();

    smart.MudarCanal(25);
    
  }
}
