import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter Integer: ");
    int number = myObj.nextInt();
    for (int i=0; i < 5; i++)
      {
        for (int j=number; j>0; j--)
        {
          System.out.print("*");
        }
        number -= 1;
        System.out.println("");
      }
  }
}
