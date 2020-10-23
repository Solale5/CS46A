import java.util.Scanner;
/**
 * Write a description of class DJIA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DJIA
{public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        
        double priceOfDay;
         System.out.print("Enter the change for the day or Q to quit: ");
        
        
        while (scan.hasNextDouble())
        {
            priceOfDay = scan.nextDouble();
             
            System.out.println(priceOfDay);
            System.out.print("Enter net income or Q to quit: ");
            
            
            
        }
        if(scan.nextLine().equals ("Q") )
            {
                 System.out.println("No values entered");
            }
          
        
       
        
        
        
        

    }
}
