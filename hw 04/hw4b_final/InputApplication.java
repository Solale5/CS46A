import java.util.Scanner;
/**
 * Working with Scanner to get 
 * keyboard input
 *
 * @author 
 */
public class InputApplication
{
    public static void main (String [] args)
    {

        Scanner scan = new Scanner (System.in); 
        int x;
        System.out.print("Enter an integer: "); 
        x = scan.nextInt(); 
        System.out.println(x);
        
        
        int z;
        System.out.print("Enter another integer: ");
        z = scan.nextInt();
        System.out.println(z);
        
        
        double a;
        System.out.print("Enter a double: ");
        a = scan.nextDouble();
        System.out.println(a);
        
        
        int product = z*x;
        System.out.println(product);
        
        double quotient = product / a;
        System.out.println(quotient);
        
        int round = (int)(quotient);
        System.out.println(round);
        
        
        
    } 


}
    
