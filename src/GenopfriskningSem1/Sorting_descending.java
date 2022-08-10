package GenopfriskningSem1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Sorting_descending  {
 // private String[] tekststreng = {"abekat", "musefælde", "ananas", "slut", "solskin"};
  private String[] tekststreng = new String[5];

  public void sortTextDescending(){

    Scanner input = new Scanner(System.in);

    System.out.println("Program for at sortere navn i omvendt rækkefølge");
    for (int i = 1; i < 6; i++) {
      System.out.print("Skriv ind ord nr. " + i + ":");
      tekststreng[i-1] = input.nextLine();
    }
    Arrays.sort(tekststreng, Collections.reverseOrder());

    for (String s: tekststreng){
      System.out.println(s);
    }
  }


  public static void main(String[] args) {
    Sorting_descending sd = new Sorting_descending();
    sd.sortTextDescending();
  }
}
