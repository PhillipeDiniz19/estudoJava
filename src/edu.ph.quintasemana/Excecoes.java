import java.text.NumberFormat;
import java.text.ParseException;

public class Excecoes {
  public static void main(String[] args){
    // Number valor = Double.valueOf("a1.75");
    // System.out.println(valor);

    try {
      Number valorDois = NumberFormat.getInstance().parse("a1.75");
      System.out.println(valorDois);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
