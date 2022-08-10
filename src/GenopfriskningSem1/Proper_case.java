package GenopfriskningSem1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Proper_case {

//TODO: IKKE FÆRDIG!
// Behøver jeg at lave et array? Eller kan man søge i strengen?

  public void addWords() {
    Scanner input = new Scanner(System.in);

    System.out.print("Skriv ind din sætning her:");

    String splitSentence = input.nextLine();
    String[] str = splitSentence.split(" ");
    //char[] ch = splitSentence.toCharArray();

   // int count = 0;

    for (int i = 0; i < 1; i++) {
     /*
      if(Character.isLetter((ch[i])) || Character.isDigit((ch[i]))){
        count++;
      }

      */
  // splitSentence.length() <= 2
      if(splitSentence.length() <= 1 && (!Character.isUpperCase(splitSentence.charAt(i)))){
        int indexLetter = splitSentence.indexOf(splitSentence);
        String word = splitSentence.substring(indexLetter);
        word = word.toLowerCase();
        System.out.print(word);

  // splitSentence.length() > 2 count > 3
      } else if (splitSentence.length() > 2 && (!Character.isUpperCase(splitSentence.charAt(i)))) {
                int indexFirstName = splitSentence.indexOf(splitSentence);
                String firstLetter = splitSentence.substring(indexFirstName,1);
                firstLetter = firstLetter.toUpperCase();
                String resten = splitSentence.substring(1);
                resten = resten.toLowerCase();
                System.out.print(firstLetter + resten);
// (Character.isUpperCase(splitSentence.charAt(i)))
      } else {
        for (String s : str) {
          System.out.println(s);
        }
      }
    }
  }



  /*
public void addWords() {
    Scanner input = new Scanner(System.in);

    System.out.print("Skriv ind din sætning her:");

    String splitSentence = input.nextLine();
    String str[] = splitSentence.split(" ");

    for (int i = 0; i < 1; i++) {

      if (Character.isUpperCase(str.length)) {
        for (String s : str) {
          System.out.println(s);
        }
      }

      int count = 0;

      for (int j = 0; j < 1; j++) {
        if(Character.isDefined(splitSentence.charAt(i))){
          count++;

            if(count <= 3){
              int indexLetter = splitSentence.indexOf(splitSentence);
              String word = splitSentence.substring(indexLetter);
              word = word.toLowerCase();
              System.out.println(word);
// (count > 3 && (!Character.isUpperCase(str.length)
            } else {
                int indexFirstName = splitSentence.indexOf(splitSentence);
                String firstLetter = splitSentence.substring(indexFirstName,1);
                firstLetter = firstLetter.toUpperCase();
                String resten = splitSentence.substring(1);
                resten = resten.toLowerCase();
                System.out.println(firstLetter + resten);

              }
            }
          }
        }
      }
 */

  public static void main(String[] args) {

    Proper_case pc = new Proper_case();
    pc.addWords();

  }



}
