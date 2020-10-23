import java.util.Scanner;
public class AnalyzingNumbers
{
    public static void main (String [] args)
    { 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two doubles (like this: 41.7 -22.5): ");
        double firstDouble = scan.nextDouble();
        double secondDouble = scan.nextDouble();
        if (secondDouble > 100)
        {
            System.out.println("The second number is greater than 100 ");
        }    
        if(firstDouble == (int)firstDouble)
        {
            System.out.println("The first number is an integer");
        }    
        else
        {
            System.out.println("The first number is an not an integer ");
        }    
        if(firstDouble == secondDouble)
        {
            System.out.println("The numbers are equal");
        }
        if(firstDouble > secondDouble)
        {
            System.out.println("The first number is larger");
        }
        if(firstDouble < secondDouble)
        {
            System.out.println("The second number is larger");
        }
        if(firstDouble > 0 == secondDouble > 0)
        {
            System.out.println("The numbers have the same sign");
        } 
        else
        { System.out.println("The numbers have different signs");
        }

    
    
    
    }    
}   