public class Smart {
  boolean ligado = false;
  int canal = 1;
  int volume = 25;
  
  public void Ligar() {
    ligado = true;
  }
  public void Desligar() {
    ligado = false;
  }
  public void AumentarVolume() {
    volume++;
    System.out.println("Aumentando volume: " + volume);
  }
  public void DiminuirVolume() {
    volume--;
    System.out.println("Diminuindo volume: " + volume);
  }

}
