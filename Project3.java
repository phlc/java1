public class Project3{
  public static void main(String[] args){
    //declarations
    String text = "This is some \"really\" great. (Text)!?";

    //normalize
    text = normalize(text);

    //show
    System.out.println(text);

  }//end of main Function

  /*
  normalize - removes white space, punctuation and changes to uppercase
  @param: String to be normalized
  @return: String normalized
  */
  public static String normalize(String s){
    //remove white space
    s = s.replaceAll(" ", "");

    //remove any punctuation
    s = s.replaceAll("\\W", "");

    //change to uppercase
    s = s.toUpperCase();

    //return
    return(s);
  }
}//end of class Project3
