public class Project3{
  public static void main(String[] args){
    //declarations
    String text = "This is some \"really\" great. (Text)!?";

    //normalize
    text = normalize(text);

    //cipher
    text = cipher(text, -27);

    //group
    text = group(text, 2);

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
  }//end fo normalize Function

  /*
  charcrypt - encrypts a char using Caesar cipher
  @param: char to be encrypted, int key
  @return: char encrypted
  */
  public static char charcrypt (char c, int k){
    if (k>=0){
      c = (char)(
                ((((int)c)+k-65)%26)+65
      );
    }//end if
    else{
      c = (char)((int)c+(k%26));
      if (c<'A'){
        c = (char)(
                ((int)c)+26
        );
      }
    }//end else
    //return
    return (c);
  }//end of charcrypt Function
  /*
  cipher - encrypts a string using Caesar cipher
  @param: String to be encrypted, int key
  @return: encrypted String
  */
  public static String cipher (String s, int k){
    //declarations
    char c = ' ';
    String result = "";

    //encrypt
    for (int i=0; i<s.length(); i++){
      c = s.charAt(i);
      c = charcrypt(c, k);
      result = result + c;

    }//end for
    //return
    return(result);
  }//end of cipher Function

  /*
  group - Brokes a String in groups of n letters
  @param: String, int n
  @return: String of the groups separated by white space
  */
  public static String group(String s, int n){
    //declarations
    String result = "";

    //group
    for(int i=0; i<s.length(); i++){
      result = result+s.charAt(i);
      if ( ((i+1)%n)==0 && i!=(s.length()-1))
        result = result+" ";
    }//end for

    //padding
    for (int i=0; i<(n-(s.length()%n)); i++){
      result = result+"x";
    }//end for

    //return
    return(result);
  }//end of group Function
}//end of class Project3
