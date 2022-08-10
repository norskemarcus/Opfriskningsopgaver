package GenopfriskningSem1;

public class Search {

  private String[] list = {"Mandag", "Tirsdag", "Onsdag"};

  public int getIndex(String[] list, String word) {

    // Findes ordet i arrayet allerede? I såfald returnere indexposition
    for (int i = 0; i < list.length; i++) {
      if (list[i].equals(word)) {
        return i;

      }/* else {
        //Alternativ fejlhåndtering; kaster en exception
        throw new RuntimeException();
      }
      */
    }
    return -1;
  }

  public void runProgram() {

    try {
    System.out.println(getIndex(list, "Onsdag"));
    System.out.println(getIndex(list, "Torsdag"));
    System.out.println(getIndex(list, "Mandag"));

    } catch (RuntimeException runtimeException) {
      System.out.println(runtimeException.getMessage());
   }

  }


  public static void main(String[] args) {
    Search search = new Search();
    search.runProgram();

  }
}
