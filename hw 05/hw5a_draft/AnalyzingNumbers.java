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
         
         System.out.println("All done");
         
     }
     
    
    
    
    
    
    
 }    
     