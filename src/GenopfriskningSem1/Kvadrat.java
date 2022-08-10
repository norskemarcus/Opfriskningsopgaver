package GenopfriskningSem1;

public class Kvadrat {

  public void lageEtKvadrat(int heltal, char tegn){

    for (int i = heltal; i > 0 ; i--) {
      for (int j = heltal; j > 0 ; j--) {
        System.out.print(" " + tegn + " ");
      }
      System.out.println(" ");
    }

  }

  public static void main(String[] args) {

    Kvadrat kvadrat = new Kvadrat();
    kvadrat.lageEtKvadrat(6, '+');

  }

}
