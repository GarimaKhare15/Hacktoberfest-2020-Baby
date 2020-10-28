import java.util.Scanner;
import java.util.regex.*;
class MyException extends Exception{}
class Main
{
  public static void main(String[] args)
  {
    String id;
    Scanner s1=new Scanner(System.in);
    id=s1.nextLine();
    String pattern = "[a-z0-9]+['@'][a-z]{1,}['.'][a-z]{2,}";
    if(Pattern.matches(pattern,id))
      System.out.println("Valid");
    else{
      try{
      throw new MyException();
      }
      catch(MyException e)
      {
        System.out.println("Invalid");
      }
    }
  }
}
