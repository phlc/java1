//imports
import java.util.Scanner;

//Class Project2
public class Project2{
  //global definitions
  static String choice = new String();
  static String name = new String();

  //main Function
  public static void main(String[] args){
    pick();



  }//end of main

  //pick Function
  public static void pick(){
    //declarations
    Scanner input = new Scanner(System.in);

    //Welcome
    System.out.print("Hi there, let's play \"Odds or Evens\", what's your name? ");
    name = input.nextLine();

    //Choosing
    System.out.print("Nice to meet you, "+name+", choose (O)dds or (E)vens: ");
    choice = input.next();

    //Check and repeat for valid answer
    while (!choice.equals("O") && !choice.equals("E")){
      System.out.print("Sorry, invalid answer. Type \"O\" or \"E\": ");
      choice = input.next();
    }//end while

    //Print choice
    if (choice.equals("O")){
      System.out.println(name+" has picked Odds. Computer will be Evens");
    }//end if
    else {
      System.out.println(name+" has picked Evens. Computer will be Odds");
    }// end else
    System.out.println("\n-----------------");

  }//end of pick
}//end of class Project2
