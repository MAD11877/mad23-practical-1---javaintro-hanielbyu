import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
   Scanner myObj = new Scanner(System.in);
    System.out.println("Enter Integer: ");
    int number = myObj.nextInt();  
    number *= number;
    System.out.println(number); 
  }
}
