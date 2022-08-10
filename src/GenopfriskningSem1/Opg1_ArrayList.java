package GenopfriskningSem1;

import java.util.ArrayList;

public class Opg1_ArrayList {

  private ArrayList<String> liste = new ArrayList<>();

  public boolean doesArraylistContainString(ArrayList<String> liste, String ord) {

    for (String element : liste) {
      return element.contains(ord);
    }
    return false;
  }


  public ArrayList<String> getListe() {
    return liste;
  }
}



