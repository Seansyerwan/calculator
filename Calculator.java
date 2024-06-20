import java.util.*;

public class Calculator{



    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean cease = false;

    while(cease == false){
        System.out.println("____________________");
        System.out.println("These commands are available: ");
        System.out.println("");
        System.out.println("ADDITION: enter 1 please.");
        System.out.println("SUBTRACTION: using the - key");
        System.out.println("MULTIPLICATION: using the * key");
        System.out.println("DIVISION (no remainder): using the / key");
        System.out.println("REMAINDER FROM DIVISION: using the % key");
        System.out.println("END PROGRAM: by typing the word end");        
        System.out.println("");
        System.out.println("Please input what you wish to do.");
        System.out.println("____________________");

        String input = sc.nextLine();
        if(input.equalsIgnoreCase("end")){
            cease = true;
        }
    }

    System.out.println("");
    System.out.println("Thank you for using my Calculator, closing program.");
    }



}


