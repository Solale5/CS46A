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
        
    } 


}
    
