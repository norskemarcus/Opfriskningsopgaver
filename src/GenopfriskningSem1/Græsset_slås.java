package GenopfriskningSem1;

import java.util.Scanner;

public class Græsset_slås {

  private int græshøjdeKunde;
  private int maxGræshøjdeKunde;

// Græsset skal slås inden max-værdien overstiges.
// Om sommeren vokser græsset ca. 0,8 cm om dagen.

  public double antalDageKlip(int græshøjdeNu, int maxGræshøjde){
  int græsCm = maxGræshøjde - græshøjdeNu;
  return græsCm / 0.8;
  }

  public void mainMenu(){
    Scanner input = new Scanner(System.in);
    System.out.print("Tast ind dagens græslængde:");
    græshøjdeKunde = input.nextInt();
    System.out.print("Tast ind max græslængde (græsset skal slås inden max-værdien overstiges):");
    maxGræshøjdeKunde = input.nextInt();

    System.out.print("Antal dage til græsset skal slåes igen: ");
    System.out.println(antalDageKlip(græshøjdeKunde, maxGræshøjdeKunde));

  }


  public static void main (String[] args){

    Græsset_slås gs = new Græsset_slås();
    gs.mainMenu();



  }


}
