package GenopfriskningSem1;

import java.util.ArrayList;

public class Bibliotek {

  private ArrayList<Bog> bogliste = new ArrayList<>();

   public static void main(String[] args){

    Bibliotek bibliotek = new Bibliotek();

    Bog bog1 = new Bog("0011223344", "Førstebog", 1900);
    Bog bog2 = new Bog("2233445566", "Andenbog", 1950);
    Bog bog3 = new Bog("5522774488", "Tredjebog", 2000);

    bibliotek.getBogliste().add(bog1);
    bibliotek.getBogliste().add(bog2);
    bibliotek.getBogliste().add(bog3);

     for (int i = 0; i < bibliotek.getBogliste().size(); i++) {
       System.out.println(bibliotek.getBogliste().get(i).getIsbn());
     }

    bibliotek.checkIsbn(bog2);

  }

  //Skriv en metode i Bibliotek klassen, som tager et Bog objekt som parameter, og returnerer true,
  // hvis listen indeholder et Bog objekt med samme ISBN

  public ArrayList<Bog> getBogliste() {
    return bogliste;
  }

  public boolean checkIsbn(Bog bog){

      if(bogliste.contains(bog)){
        System.out.println("ISBN-number is already in the system");
        return true;
      }
      else{
        System.out.println("False - ISBN-number not known");
        return false;
      }
    }

}
