//imports
import java.util.Scanner;
import java.util.Random;

//Class Project2
public class Project2{
  //global definitions
  static String choice = new String();
  static String name = new String();

  //main Function
  public static void main(String[] args){
    pick();
    play();



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
    System.out.println("\n-----------------\n");

  }//end of pick

  //play Function
  public static void play (){
    //declarations
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int number = -1;
    int computer = -1;
    int result = -1;

    //Number choice and check
    do{
    System.out.print("How many \"fingers\" do you put out? (0 - 5)? ");
    number = input.nextInt();
    }while (0>number || number>5);

    //Computer number
    computer = rand.nextInt(6);
    System.out.println("Computer plays "+computer+".");
    System.out.println("\n-----------------\n");

    //Show result
    result = number + computer;
    System.out.print(number+" + "+computer+" = "+result+".\n"+result);
    result = result%2;
    if (result==0){
      System.out.println(" is... even!");
    }//end if
    else{
      System.out.println(" is... odd!");
    }//end else

    //Show winner
    number = 0;
    if (choice.equals("O")){
      number=1;
    }
    if (result==number){
      System.out.println("That means "+name+" wins! :-)");
    }//end if
    else {
      System.out.println("That means computer wins! :-(");
    }//end else
    System.out.println("\n-----------------\n");
  }//end of play Function
}//end of class Project2
