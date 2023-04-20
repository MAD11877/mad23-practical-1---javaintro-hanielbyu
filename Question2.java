import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner myObj = new Scanner(System.in);
//     System.out.println("Enter Height(m): ");
    double height = myObj.nextDouble();  
//     System.out.println("Enter Weight(kg): ");
    double weight = myObj.nextDouble();
    double bmi = weight/(height*height);
    System.out.println(bmi);
  }
}
