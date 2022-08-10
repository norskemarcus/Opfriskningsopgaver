package GenopfriskningSem1;

import java.util.ArrayList;

public class Main {


    public void printResultArrayList(){
        Opg1_ArrayList opg1 = new Opg1_ArrayList();

        ArrayList<String> temp = opg1.getListe();
        temp.add("Danmark");
        temp.add("Sverige");
        temp.add("Norge");

        boolean answer = opg1.doesArraylistContainString(temp, "Norge");

        if (answer){
            System.out.println("The String has been found");
        } else {
            System.out.println("The String has been added to the list");
        }

        System.out.println("The list now contains:");
        System.out.println(opg1.getListe());
        System.out.println("");
        System.out.println("ArrayList uden klammer:");
        for (String s : opg1.getListe()){
            System.out.println(s);
        }

    }



    public static void main(String[] args) {

    Main main = new Main();

    main.printResultArrayList();


    }
}
